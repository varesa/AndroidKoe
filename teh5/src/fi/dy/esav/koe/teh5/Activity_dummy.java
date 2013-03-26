package fi.dy.esav.koe.teh5;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Activity_dummy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dummy);
		
		Intent intent = getIntent();
		
		TextView tw = (TextView) findViewById(R.id.text);
		tw.setText("This is an awesome game (not really)\n You have selected " + intent.getExtras().getString("vaikeus") + " as the difficulty");
		
		
	}
}
