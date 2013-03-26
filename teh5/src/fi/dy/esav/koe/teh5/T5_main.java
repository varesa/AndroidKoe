package fi.dy.esav.koe.teh5;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class T5_main extends Activity implements OnClickListener{

	Spinner valinta;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_t5_main);
		valinta = (Spinner) findViewById(R.id.spinner1);
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Context c = this;
		
		Intent i = new Intent(this, Activity_dummy.class);
		i.putExtra("vaikeus", valinta.getSelectedItem().toString());
		startActivity(i);
		
	}

}
