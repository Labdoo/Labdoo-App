* License

  All of Labdoo's source code is released under GPL version 3 or later.

  **//Implementing flash screen//**
	
  package com.labdoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash<intent> extends Activity {
Thread Splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Splash = new Thread(){
        	public void run(){
        	try{
        		sleep(3000);
        	}
        	catch(InterruptedException e){
        		e.printStackTrace();
        	}
        	finally
        	{
				Intent nn=new Intent(Splash.this,Login.class);
        		startActivity(nn);
        		}
          }
        };
        Splash.start();
    }
	
	**// Implementing Login Screen//**

}
package com.labdoo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//button 2(Create New Account)
public class Login extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		setupMessageButton();
	}
	private void setupMessageButton(){
		Button MeassageButton = (Button) findViewById(R.id.Account);
		MeassageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Login.this, "Please wait", Toast.LENGTH_SHORT).show();
				Intent nn=new Intent(Login.this,CreateNewAccount.class);
        		startActivity(nn);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}