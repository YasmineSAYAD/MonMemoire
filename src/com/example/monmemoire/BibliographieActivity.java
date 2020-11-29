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

public class BibliographieActivity extends Activity implements OnClickListener,OnItemClickListener{
Button bretour,bquitter;
ListView listebib;
String bib []=new String []{"Définition","Pourquoi mettre les références?","Comment construire une bibliographie?","Comment lister les références?","Elements principeaux d'une citation","Comment citer un article scientifique?","Comment citer un livre?","Comment citer un mémoire ou une thèse?","Comment citer un document électronique?","Comment citer un logiciel?"} ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bibliographie);
		bquitter=(Button) findViewById(R.id.buttq);
		bquitter.setOnClickListener(this);
		bretour=(Button) findViewById(R.id.butreto);
		bretour.setOnClickListener(this);
		listebib=(ListView) findViewById(R.id.lvbib);
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, bib);
		listebib.setAdapter(adap);
		listebib.setOnItemClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if (v==bquitter) {
			Intent i=new Intent(Intent.ACTION_MAIN);
			i.addCategory(Intent.CATEGORY_HOME);
			startActivity(i);
		}
		if (v==bretour) {
			Intent i=new Intent(this,PlanActivity.class);
			startActivity(i);
		}
		
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int i, long arg3) {
		switch (i) {
		case 0:
			Intent in1=new Intent(this,DefBibliographieActivity.class);
			Toast.makeText(this, "Défintion", Toast.LENGTH_LONG).show();
			startActivity(in1);
			
			
			break;
		case 1:
			Intent in2=new Intent(this,RefBibliographieActivity.class);
			Toast.makeText(this, "Pourqoui mettre des références", Toast.LENGTH_LONG).show();
			startActivity(in2);
			break;
		case 2:
			Intent in3=new Intent(this,ConstBibliographieActivity.class);
			Toast.makeText(this, "Comment construire une bibliographie?", Toast.LENGTH_LONG).show();
			startActivity(in3);
			break;
		case 3:
			Intent in4=new Intent(this,ListeRefBibliographieActivity.class);
			Toast.makeText(this, "Comment lister les références?", Toast.LENGTH_LONG).show();
			startActivity(in4);
			break;
		
		case 4:
			Intent in5=new Intent(this,CitationBibliographieActivity.class);
			Toast.makeText(this, "Elements principeaux d'une citation", Toast.LENGTH_LONG).show();
			startActivity(in5);
			break;
		case 5:
			Intent in6=new Intent(this,ArticleScientifiqueActivity.class);
			Toast.makeText(this, "Comment citer un article scientifique?", Toast.LENGTH_LONG).show();
			startActivity(in6);
			break;
		case 6:
			Intent in7=new Intent(this,LivreActivity.class);
			Toast.makeText(this, "Comment citer un livre?", Toast.LENGTH_LONG).show();
			startActivity(in7);
			break;
		case 7:
			Intent in8=new Intent(this,TheseActivity.class);
			Toast.makeText(this, "Comment citer un mémoire ou une thèse?", Toast.LENGTH_LONG).show();
			startActivity(in8);
			break;
		case 8:
			Intent in9=new Intent(this,DocElectroniqueActivity.class);
			Toast.makeText(this, "Comment citer un document électronique?", Toast.LENGTH_LONG).show();
			startActivity(in9);
			break;
		case 9:
			Intent in10=new Intent(this,LogicielActivity.class);
			Toast.makeText(this, "Comment Citer un logiciel?", Toast.LENGTH_LONG).show();
			startActivity(in10);
			break;
			

		default:
			System.err.println("erreur");
			break;
		}
		
	}

	

}
