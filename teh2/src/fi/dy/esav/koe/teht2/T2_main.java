package fi.dy.esav.koe.teht2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class T2_main extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_t2_main);
		
		ImageView img1 = (ImageView) findViewById(R.id.kuva1);
		img1.setOnClickListener(this);
		ImageView img2 = (ImageView) findViewById(R.id.kuva2);
		img2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent i = null;
		
		if(v.getId() == R.id.kuva1) {
			i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
		} else if (v.getId() == R.id.kuva2){
			i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/varesa/AndroidKoe"));
		}
		
		if(i != null) {
			startActivity(i);
		}
		
	}


}
