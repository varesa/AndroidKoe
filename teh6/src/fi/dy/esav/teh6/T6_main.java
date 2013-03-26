package fi.dy.esav.teh6;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.SweepGradient;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class T6_main extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.t6_main_layout);
		
		Button b_shapes = (Button) findViewById(R.id.btn_shapes);
		Button b_circle = (Button) findViewById(R.id.btn_circle);
		Button b_complex = (Button) findViewById(R.id.btn_complex);
		
		b_shapes.setOnClickListener(this);
		b_circle.setOnClickListener(this);
		b_complex.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent i = null;
		switch(v.getId()) {
		case R.id.btn_shapes:
			i = new Intent(this, ShapesActivity.class);
			break;
		case R.id.btn_circle:
			i = new Intent(this, CircleActivity.class);
			break;
		case R.id.btn_complex:
			i = new Intent(this, LinesActivity.class);
			break;
		}
		
		if(i != null) {
			startActivity(i);
		}
		
	}

}
