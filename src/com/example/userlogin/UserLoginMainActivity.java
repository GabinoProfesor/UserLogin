package com.example.userlogin;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class UserLoginMainActivity extends ActionBarActivity {

	private static final String LOGTAG="UserLoginMainActivity";
	
	EditText editLogin;
	EditText editPassword;
	UserLogin userLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editLogin = (EditText)findViewById(R.id.editTextLogin);
		editPassword = (EditText)findViewById(R.id.editTextPassword);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickButtonAcceder(View v) {
		try {
			String login = editLogin.getText().toString();
			String password = editPassword.getText().toString();
			userLogin = new UserLogin(login, password);
			this.lanzarAccesoOk();
		} catch (UserLoginException e) {
			Log.e(LOGTAG, e.getMessage());
		}
	}

	public void lanzarAccesoOk() {
		try {
			Intent i = new Intent(this, AccesoOkActivity.class);
			i.putExtra("userName", userLogin.getLogin());
			startActivity(i);					
		}catch (Exception e) {
			Log.e(LOGTAG, e.getMessage());
		}
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
