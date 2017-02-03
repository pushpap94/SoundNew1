package com.soundnew;

import com.soundnew.Birds1.MyGestureListener;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

public class Birds2 extends Activity implements OnClickListener{
	ImageView back,home,canary,murai,cockatiel;
	MediaPlayer crowsound,parrotsound,sparrowsound;
	private GestureDetectorCompat gestureDetectorCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.bird2);
		back=(ImageView) findViewById(R.id.bback2);
		home=(ImageView) findViewById(R.id.bhome2);
		canary=(ImageView) findViewById(R.id.canarypic);
		cockatiel=(ImageView) findViewById(R.id.cockatielpic);
		murai=(ImageView) findViewById(R.id.muraipic);
		back.setOnClickListener(this);
		home.setOnClickListener(this);
		canary.setOnClickListener(this);
		cockatiel.setOnClickListener(this);
		murai.setOnClickListener(this);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		 
}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bback2:
			Intent wild=new Intent(this, Birds1.class);
			startActivity(wild);
			break;
		case R.id.bhome2:
			Intent birds=new Intent(this, MainActivity.class);
			startActivity(birds);
			break;
		case R.id.canarypic:
			 Animation shake = AnimationUtils.loadAnimation(Birds2.this, R.anim.wave_scale);
	      		findViewById(R.id.canarypic).startAnimation(shake); 
			Toast.makeText(getApplicationContext(), "CANARY", Toast.LENGTH_SHORT).show();
	    	 crowsound=MediaPlayer.create(Birds2.this,R.raw.canarysound);
	    	 crowsound.start();
			break;
         case R.id.cockatielpic:
        	 Animation shake1 = AnimationUtils.loadAnimation(Birds2.this, R.anim.wave_scale);
       		findViewById(R.id.cockatielpic).startAnimation(shake1); 
        	 Toast.makeText(getApplicationContext(), "COCKATIEL", Toast.LENGTH_SHORT).show();
	    	 crowsound=MediaPlayer.create(Birds2.this,R.raw.cockatielsound);
	    	 crowsound.start();
			break;
         case R.id.muraipic:
        	 Animation shake2 = AnimationUtils.loadAnimation(Birds2.this, R.anim.wave_scale);
       		findViewById(R.id.muraipic).startAnimation(shake2); 
        	 Toast.makeText(getApplicationContext(), "MURAI", Toast.LENGTH_SHORT).show();
        	 crowsound=MediaPlayer.create(Birds2.this,R.raw.muraisound);
        	 crowsound.start();
	break;
	}
	}
	
	@Override
	 public boolean onTouchEvent(MotionEvent event) {
	  this.gestureDetectorCompat.onTouchEvent(event);
	        return super.onTouchEvent(event);
	 }

	 class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
	  //handle 'swipe left' action only

	        @Override
	        public boolean onFling(MotionEvent event1, MotionEvent event2, 
	                float velocityX, float velocityY) {
	         
	         if(event2.getX() < event1.getX())
	         {
	        	 startActivity(new Intent(Birds2.this, Animals1.class));
	        // Toast.makeText(getApplicationContext(), "left", 0).show();
	         }
	         else if(event1.getX() < event2.getX())
	         {
	        	// Toast.makeText(getApplicationContext(), "right", 0).show();
	          
	        	 startActivity(new Intent(Birds2.this, Birds1.class));
	         }
	         
//	         {
//	             Intent intent = new Intent(
//	            		 Birds2.this, Animals1.class);
//	             startActivity(intent);
//	         }
//	         
//	         else if(event2.getX() > event1.getX()){
//		             Intent intent = new Intent(
//		            		 Birds2.this, Birds1.class);
//		             startActivity(intent);
//		         }
	         
	         
	         

	            return true;
	        }

			private void overridePendingTransition(int righttoleft,
					int lefttoright) {
				// TODO Auto-generated method stub
				
			}}
}