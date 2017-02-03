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

public class Animals2 extends Activity implements OnClickListener{
	ImageView back,home,panda,monkey,elephant;
	 MediaPlayer playercat,playercow,playerdog;
	 private GestureDetectorCompat gestureDetectorCompat;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.animal2);
		back=(ImageView) findViewById(R.id.aback2);
		home=(ImageView) findViewById(R.id.ahome2);
		panda=(ImageView) findViewById(R.id.pandapic);
		monkey=(ImageView) findViewById(R.id.monkeypic);
		elephant=(ImageView)findViewById(R.id.elephantpic);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
	//	elephant=(ImageView) findViewById(R.id.);
		back.setOnClickListener(this);
		home.setOnClickListener(this);
		panda.setOnClickListener(this);
		monkey.setOnClickListener(this);
		elephant.setOnClickListener(this);
}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.aback2:
			Intent wild=new Intent(this, Animals1.class);
			startActivity(wild);
			break;
		case R.id.ahome2:
			Intent birds=new Intent(this, MainActivity.class);
			startActivity(birds);
			break;
		case R.id.pandapic:
			 Animation shake = AnimationUtils.loadAnimation(Animals2.this, R.anim.wave_scale);
	      		findViewById(R.id.pandapic).startAnimation(shake); 
			Toast.makeText(getApplicationContext(), "PANDA", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals2.this,R.raw.pandasound);
	    	 playercat.start();
			break;
         case R.id.monkeypic:
        	 Animation shake2 = AnimationUtils.loadAnimation(Animals2.this, R.anim.wave_scale);
	      		findViewById(R.id.monkeypic).startAnimation(shake2); 
        	 Toast.makeText(getApplicationContext(), "MONKEY", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals2.this,R.raw.chimpanzeesound);
	    	 playercat.start();
			break;
         case R.id.elephantpic:
        	 Animation shake3 = AnimationUtils.loadAnimation(Animals2.this, R.anim.wave_scale);
	      		findViewById(R.id.elephantpic).startAnimation(shake3); 
        	 Toast.makeText(getApplicationContext(), "ELEPHANT", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals2.this,R.raw.elephantsound);
	    	 playercat.start();
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
	         if(event2.getX() < event1.getX()){
	        	 startActivity(new Intent(Animals2.this, MainActivity.class));
	        	 
	        	// Toast.makeText(getApplicationContext(), "left", 0).show();
	        	 }
	         else  if(event1.getX() < event2.getX()){
	        	// Toast.makeText(getApplicationContext(), "right", 0).show();
	        	 startActivity(new Intent(Animals2.this, Animals1.class));
	        	 }
	         return true;
        } }}
	         //{
//	             Intent intent = new Intent(
//	            		 Animals2.this, MainActivity.class);
//	             startActivity(intent);
//	         }
//	       //right 
//	         else   if(event2.getX() > event1.getX()){
//		             Intent intent = new Intent(
//		            		 Animals2.this, Animals1.class);
//		             startActivity(intent);
//		         }
//
//	            return true;
//	        }

			 
	

