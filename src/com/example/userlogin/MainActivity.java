package com.example.userlogin;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

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
		} catch (UserLoginSintaxException e) {
			Log.e(LOGTAG, e.getMessage());
			this.mensajeOK("Datos incompletos", "Error Datos");
		} catch (UserLoginException e) {
			Log.e(LOGTAG, e.getMessage());
		}
	}

	public void lanzarAccesoOk() {
		try {
			Intent i = new Intent(this, AccesoOkActivity.class);
			//i.putExtra("userName", userLogin.getLogin());
			i.putExtra("userLoginObj", userLogin);
			startActivity(i);					
		}catch (Exception e) {
			Log.e(LOGTAG, e.getMessage());
		}
	}
	
	private void mensajeOK(String texto, String titulo){
		AlertDialog.Builder dialogo= new AlertDialog.Builder(this);
		dialogo.setTitle(titulo);
		dialogo.setMessage(texto);
		dialogo.setPositiveButton("Aceptar", null);
		dialogo.create();
		dialogo.show();
		
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
