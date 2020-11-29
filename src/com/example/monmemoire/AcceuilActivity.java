package com.example.monmemoire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AcceuilActivity extends Activity implements OnClickListener {
	Button bquitter, bcontinuer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acceuil);
		bquitter=(Button) findViewById(R.id.bquit);
		bquitter.setOnClickListener(this);
		bcontinuer=(Button) findViewById(R.id.bcont);
		bcontinuer.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v==bquitter) {
			Intent i=new Intent(Intent.ACTION_MAIN);
			i.addCategory(Intent.CATEGORY_HOME);
			Toast.makeText(this,"Quitter l'application",Toast.LENGTH_LONG).show();
			startActivity(i);
		}
		if (v==bcontinuer) {
			Intent i1=new Intent(this,PlanActivity.class);
			Toast.makeText(this,"Bienvenue",Toast.LENGTH_LONG).show();
			startActivity(i1);
		}
		
	}



}
