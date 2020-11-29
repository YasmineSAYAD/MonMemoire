package com.example.monmemoire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LogicielActivity extends Activity implements OnClickListener{
Button bquitter,bretour;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logiciel);
		bretour=(Button) findViewById(R.id.buttonreto);
		bretour.setOnClickListener(this);
		bquitter=(Button) findViewById(R.id.buttonquit);
		bquitter.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v==bretour) {
			Intent i =new Intent(this,BibliographieActivity.class);
			startActivity(i);
			
		}
		if (v==bquitter) {
			Intent i=new Intent(Intent.ACTION_MAIN);
			i.addCategory(Intent.CATEGORY_HOME);
			startActivity(i);
		}
	}

	

}
