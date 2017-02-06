package com.soundnew;


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


public class Birds1 extends Activity implements OnClickListener{
	ImageView back,home,crow,sparrow,parrot;
	MediaPlayer crowsound,parrotsound,sparrowsound;
	private GestureDetectorCompat gestureDetectorCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.bird1);
		back=(ImageView) findViewById(R.id.bnext1);
		home=(ImageView) findViewById(R.id.bhome1);
		crow=(ImageView) findViewById(R.id.crowpic);
		sparrow=(ImageView) findViewById(R.id.sparrowpic);
		parrot=(ImageView) findViewById(R.id.parrotpic);
		back.setOnClickListener(this);
		home.setOnClickListener(this);
		crow.setOnClickListener(this);
		sparrow.setOnClickListener(this);
		parrot.setOnClickListener(this);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		
		  
}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bnext1:
			Intent wild=new Intent(this, Birds2.class);
			startActivity(wild);
			break;
		case R.id.bhome1:
			Intent birds=new Intent(this, MainActivity.class);
			startActivity(birds);
			break;
		case R.id.crowpic:
			Animation shake = AnimationUtils.loadAnimation(Birds1.this, R.anim.wave_scale);
    		findViewById(R.id.crowpic).startAnimation(shake);  
			Toast.makeText(getApplicationContext(), "CROW", Toast.LENGTH_SHORT).show();
	    	 crowsound=MediaPlayer.create(Birds1.this,R.raw.crowsound);
	    	 crowsound.start();
			break;
         case R.id.sparrowpic:
        	 Animation shake1 = AnimationUtils.loadAnimation(Birds1.this, R.anim.wave_scale);
     		findViewById(R.id.sparrowpic).startAnimation(shake1);  
        	 Toast.makeText(getApplicationContext(), "SPARROW", Toast.LENGTH_SHORT).show();
	    	 crowsound=MediaPlayer.create(Birds1.this,R.raw.sparrowso);
	    	 crowsound.start();
			break;
         case R.id.parrotpic:
        	 Animation shake2 = AnimationUtils.loadAnimation(Birds1.this, R.anim.wave_scale);
      		findViewById(R.id.parrotpic).startAnimation(shake2); 
        	 Toast.makeText(getApplicationContext(), "PARROT", Toast.LENGTH_SHORT).show();
        	 crowsound=MediaPlayer.create(Birds1.this,R.raw.parrotsound);
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
	        	//left
	         if(event2.getX() < event1.getX())
	         {
	        	 startActivity(new Intent(Birds1.this, Birds2.class));
	         //Toast.makeText(getApplicationContext(), "left", 0).show();
	        	 }
	         else  if(event1.getX() < event2.getX()){
	        	// Toast.makeText(getApplicationContext(), "right", 0).show();
	        	 startActivity(new Intent(Birds1.this, Pets2.class));}
	          
//	         {
//	             Intent intent = new Intent(
//	            		 Birds1.this, Birds2.class);
//	             startActivity(intent);
//	         }
//	       //right 
//	         else  if(event2.getX() > event1.getX()){
//		             Intent intent = new Intent(
//		            		 Birds1.this, Pets2.class);
//		             startActivity(intent);
//		         }

	            return true;
	        }

			private void overridePendingTransition(int lefttoright,
					int righttoleft) {
				// TODO Auto-generated method stub
				
			}}
}
