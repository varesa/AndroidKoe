package fi.dy.esav.teh6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ShapeView extends View {

	int tx = -100;
	float txv = 0.09f;
	int ty = 0;
	float tyv = 0.15f;
	
	int sx = 500;
	float sxv = -0.10f;
	int sy = 600;
	float syv = -0.05f;
	
	long lasttime = -1;
	
	public ShapeView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public ShapeView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public ShapeView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		
		long delta = 0;
		
		if( lasttime == -1 ) {
			lasttime = System.currentTimeMillis();
		}
		
		delta = System.currentTimeMillis() - lasttime;
		lasttime = System.currentTimeMillis();
		
		tx += txv * delta;
		ty += tyv * delta;
		
		sx += sxv * delta;
		sy += syv * delta;
		
		Paint paint = new Paint();
		paint.setColor(Color.RED);

		canvas.drawLine(tx, ty, tx + 100, ty + 50, paint);
		canvas.drawLine(tx + 100, ty + 50, tx - 50, ty + 100, paint);
		canvas.drawLine(tx - 50, ty + 100, tx, ty, paint);
		
		paint.setColor(Color.GREEN);
		canvas.drawLine(sx, sy, sx + 50, sy, paint);
		canvas.drawLine(sx + 50, sy, sx + 50, sy + 50, paint);
		canvas.drawLine(sx + 50, sy + 50, sx, sy + 50, paint);
		canvas.drawLine(sx, sy + 50, sx, sy, paint);
		invalidate();
	}

}
