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

}