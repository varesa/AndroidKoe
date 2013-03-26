package fi.dy.esav.koe.teht1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class T1_main extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_t1_main);
		
		Button btn = (Button) findViewById(R.id.button);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(this, "haudi", Toast.LENGTH_LONG).show();
	}
}
