package com.example.monmemoire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RemerciementsActivity extends Activity implements OnClickListener {
Button bquitter,bretour;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_remerciements);
		bquitter=(Button) findViewById(R.id.bqtr);
		bquitter.setOnClickListener(this);
		bretour=(Button) findViewById(R.id.brte);
		bretour.setOnClickListener(this);
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

	

}
