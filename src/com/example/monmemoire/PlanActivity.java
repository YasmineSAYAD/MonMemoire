package com.example.monmemoire;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class PlanActivity extends Activity implements OnClickListener,OnItemClickListener {
Button bquitter,bretour;
ListView listetitres;
String titres[]=new String[]{"Orientation","Conseils","Page de garde","Remerceiments","Dédicaces","Table des matières","Introduction générale","Chapitres et sections","Conclusion générale","Bibliographie","Mise en page","Modèles"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plan);
		bquitter=(Button) findViewById(R.id.bq);
		bquitter.setOnClickListener(this);
		bretour=(Button) findViewById(R.id.bret);
		bretour.setOnClickListener(this);
		listetitres=(ListView) findViewById(R.id.lvbib);
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, titres);
		listetitres.setAdapter(adap);
		listetitres.setOnItemClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
	if (v==bquitter) {
		Intent i=new Intent(Intent.ACTION_MAIN);
		i.addCategory(Intent.CATEGORY_HOME);
		startActivity(i);
	}
	if (v==bretour) {
		Intent i=new Intent(this,AcceuilActivity.class);
		startActivity(i);
		
	}
		
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int i, long arg3) {
		switch (i) {
		case 0:
			Intent in1=new Intent(this,OrientationActivity.class);
			startActivity(in1);
			break;
		case 1:
			Intent in2=new Intent(this,ConseilActivity.class);
			startActivity(in2);
			break;
		case 2:
			Intent in3=new Intent(this,PageDeGardeActivity.class);
			startActivity(in3);
			break;
		case 3:
			Intent in4=new Intent(this,RemerciementsActivity.class);
		    startActivity(in4);
			break;
		
		case 4:
			Intent in5=new Intent(this,DedicacesActivity.class);
			startActivity(in5);
			break;
		case 5:
			Intent in6=new Intent(this,TableDesMatiereActivity.class);
			startActivity(in6);
			break;
		case 6:
			Intent in7=new Intent(this,IntroductionGeneraleActivity.class);
			startActivity(in7);
			break;
		case 7:
			Intent in8=new Intent(this,ChapitresActivity.class);
			startActivity(in8);
			break;
		case 8:
			Intent in9=new Intent(this,ConclusionGeneraleActivity.class);
			startActivity(in9);
			break;
		case 9:
			Intent in10=new Intent(this,BibliographieActivity.class);
			startActivity(in10);
			break;
		case 10:
			Intent in11=new Intent(this,MiseEnPageActivity.class);
			startActivity(in11);
			break;
	    case 11:
			Intent in12=new Intent(this,ModeleActivity.class);
			startActivity(in12);
			break;
			

		default:
			System.err.println("erreur");
			break;
		}
		
		
		
	}

	

}
