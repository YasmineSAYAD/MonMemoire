package com.example.monmemoire;

import android.net.Uri;
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

public class ModeleActivity extends Activity implements OnClickListener,OnItemClickListener{
Button bquitter,bretour;
String lien []=new String[] {"https://www.memoireonline.com/"};
ListView listelien;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modele);
		bquitter=(Button) findViewById(R.id.quitter);
		bquitter.setOnClickListener(this);
		bretour=(Button) findViewById(R.id.retour);
		bretour.setOnClickListener(this);
		listelien=(ListView) findViewById(R.id.lvlien);
		ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lien);
		listelien.setAdapter(adap);
		listelien.setOnItemClickListener(this);
		
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
			
				Uri uri=android.net.Uri.parse("https://www.memoireonline.com/");
				Intent intent=new Intent(Intent.ACTION_VIEW,uri);
				startActivity(intent);
			
			break;

		default:
			System.err.println("erreur");
			break;
		}
		
	}

	

}
