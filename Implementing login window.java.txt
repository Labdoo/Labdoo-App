package com.labdoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//button 2(Create New Account)
public class Login extends ActionBarActivity implements OnClickListener {
	EditText Email;
	EditText editText1;
	Button Login;
	Button Account;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		 Email = (EditText) findViewById(R.id.editText2);
		 editText1 = (EditText) findViewById(R.id.editText1);
		 Login = (Button)findViewById(R.id.Login);
		 Account = (Button)findViewById(R.id.Account);
		 Login.setOnClickListener(this);
		 Account.setOnClickListener(this);
	}
	public void onClick(View v) {
		
		String em=Email.getText().toString();
		String ed=editText1.getText().toString();
		
		switch(v.getId()){
		case R.id.Login:
			if(em.equals("a") && ed.equals("a")){
				Intent nn=new Intent(Login.this,Main.class);
        		startActivity(nn);
        		Toast.makeText(getBaseContext(), "Please Wait while your login details\nare verified!", Toast.LENGTH_SHORT).show();
        		Toast.makeText(getBaseContext(), "Login Successful!", Toast.LENGTH_LONG).show();
			}
			else{
				Toast.makeText(getBaseContext(), "Please Wait while your login details\nare verified!", Toast.LENGTH_SHORT).show();
				Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_SHORT).show();
				Toast.makeText(getBaseContext(), "The typed user name/email or password\n is incorrect please check and try again", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.Account:
			if(em.equals("") && ed.equals("")){
				Intent nn=new Intent(Login.this,CreateNewAccount.class);
        		startActivity(nn);
			}
				break;
				default:
					break;
		}
	}
}	
		
		
