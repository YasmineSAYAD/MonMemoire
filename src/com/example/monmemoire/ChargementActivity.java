package com.example.monmemoire;



import android.os.Bundle;
import android.os.Handler;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class ChargementActivity extends Activity {
	 boolean b;
	Handler hd;
	int t=5000;

	@SuppressLint("NewApi")
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		

			getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
			getActionBar().hide();
			setContentView(R.layout.activity_chargement);
			hd=new Handler();
			hd.postDelayed(new Runnable() {
				
				@Override
				public void run() {
					finish();
					if (!b) {
						Intent i=new Intent(getApplicationContext(),AcceuilActivity.class);
						startActivity(i);
						
					}
					
					
				}
			}, t);
			
			
			
		}
		public void onBackPressed(){
			b=true;
			super.onBackPressed();
		}
	

	
}
