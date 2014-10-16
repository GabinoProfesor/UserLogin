package com.example.userlogin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AccesoOkActivity extends Activity {

	private TextView textViewUserName;
	private UserLogin userLogin;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acceso_ok);
		
		textViewUserName = (TextView)findViewById(R.id.textViewUserName);
		//String uname = getIntent().getExtras().getString("userName");
		userLogin = (UserLogin)getIntent().getExtras().
				getSerializable("userLoginObj");
		textViewUserName.setText(userLogin.getLogin());
	}
	
	public void onClickButtonLogout(View v){
		confirmar("Confirmar Logout?","Confirmar");
	}

	private void confirmar(String texto, String titulo){
		AlertDialog.Builder dialogConfirmar = new AlertDialog.Builder(this);
		dialogConfirmar.setTitle(titulo);
		dialogConfirmar.setMessage(texto);
		dialogConfirmar.setCancelable(false);
		dialogConfirmar.setPositiveButton("Confirmar", 
				new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				confirmar();
			}

			private void confirmar() {
				// TODO Auto-generated method stub
				finish();
			}
		});
		dialogConfirmar.setNegativeButton("Cancelar", 
				new DialogInterface.OnClickListener() {
					
				
					/* (non-Javadoc)
					 * @see android.content.DialogInterface.OnClickListener#onClick(android.content.DialogInterface, int)
					 */
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						cancelar();
					}

					private void cancelar() {
						// TODO Auto-generated method stub
						
					}
					
				});
		dialogConfirmar.show();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}

}
