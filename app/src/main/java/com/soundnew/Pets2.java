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

public class Pets2 extends Activity implements OnClickListener{
	ImageView back,home,rabbit,sheep,goat,rat;
	 MediaPlayer playercat,playercow,playerdog;
	 private GestureDetectorCompat gestureDetectorCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pet2);
		back=(ImageView) findViewById(R.id.pback2);
		home=(ImageView) findViewById(R.id.phome2);
		rabbit=(ImageView) findViewById(R.id.rabbitpic);
		sheep=(ImageView) findViewById(R.id.sheeppic);
		goat=(ImageView) findViewById(R.id.goatpic);
		rat=(ImageView) findViewById(R.id.ratpic);
		back.setOnClickListener(this);
		home.setOnClickListener(this);
		rabbit.setOnClickListener(this);
		sheep.setOnClickListener(this);
		goat.setOnClickListener(this);
		rat.setOnClickListener(this);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		 
		 rabbit.setOnClickListener(new View.OnClickListener(){
		       	@Override
		          	public void onClick(View v) {
		       		Animation shake = AnimationUtils.loadAnimation(Pets2.this, R.anim.wave_scale);
		    		findViewById(R.id.rabbitpic).startAnimation(shake);  
		       		Toast.makeText(getApplicationContext(), "RABBIT", Toast.LENGTH_SHORT).show();
		       	 playercat=MediaPlayer.create(Pets2.this,R.raw.wheeking);
		       	 playercat.start();
		  	}});
		 sheep.setOnClickListener(new View.OnClickListener(){
		       	@Override
		          	public void onClick(View v) {
		       		Animation shake = AnimationUtils.loadAnimation(Pets2.this, R.anim.wave_scale);
		    		findViewById(R.id.sheeppic).startAnimation(shake);
		       		Toast.makeText(getApplicationContext(), "SHEEP", Toast.LENGTH_SHORT).show();
		       	 playercat=MediaPlayer.create(Pets2.this,R.raw.sheepound);
		       	 playercat.start();
		  	}});
		
		 goat.setOnClickListener(new View.OnClickListener(){
		       	@Override
		          	public void onClick(View v) {
		       		Animation shake = AnimationUtils.loadAnimation(Pets2.this, R.anim.wave_scale);
		    		findViewById(R.id.goatpic).startAnimation(shake);  
		       		Toast.makeText(getApplicationContext(), "GOAT", Toast.LENGTH_SHORT).show();
		       	 playercat=MediaPlayer.create(Pets2.this,R.raw.goatsound);
		       	 playercat.start(); 
		  	}});
		 rat.setOnClickListener(new View.OnClickListener(){
		       	@Override
		          	public void onClick(View v) {
		       		Animation shake = AnimationUtils.loadAnimation(Pets2.this, R.anim.wave_scale);
		    		findViewById(R.id.ratpic).startAnimation(shake);  
		       		Toast.makeText(getApplicationContext(), "RAT", Toast.LENGTH_SHORT).show();
		       	 playercat=MediaPlayer.create(Pets2.this,R.raw.rat);
		       	 playercat.start(); 
		  	}});
		
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
	        	   startActivity(new Intent(Pets2.this, Birds1.class));
	       //  Toast.makeText(getApplicationContext(), "left", 0).show();
	         }
	         else  if(event1.getX() < event2.getX()){
	        	// Toast.makeText(getApplicationContext(), "right", 0).show();
	        	 startActivity(new Intent(Pets2.this, Pets1.class));
	        	 }
//	             Intent intent = new Intent(
//	               Pets2.this, Birds1.class);
//	             startActivity(intent);
//	         }
  //right 
//	         else  if(event2.getX() > event1.getX()){
//		             Intent intent = new Intent(
//		            		 Pets2.this, Pets1.class);
//		             startActivity(intent);
//		         }
	            return true;
	        }

	 }  
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
	case R.id.pback2:
		Intent wild=new Intent(this, Pets1.class);
		startActivity(wild);
		break;
	case R.id.phome2:
		Intent birds=new Intent(this, MainActivity.class);
		startActivity(birds);
		break;
//	case R.id.rabbitpic:
//		Toast.makeText(getApplicationContext(), "RABBIT", Toast.LENGTH_SHORT).show();
//    	 playercat=MediaPlayer.create(Pets2.this,R.drawable.wheeking);
//    	 playercat.start();
//		break;
//	case R.id.sheeppic:
//		Toast.makeText(getApplicationContext(), "SHEEP", Toast.LENGTH_SHORT).show();
//    	 playercat=MediaPlayer.create(Pets2.this,R.drawable.sheepound);
//    	 playercat.start();
//		break;
//	case R.id.goatpic:
//		Toast.makeText(getApplicationContext(), "GOAT", Toast.LENGTH_SHORT).show();
//    	 playercat=MediaPlayer.create(Pets2.this,R.drawable.goatsound);
//    	 playercat.start();
//		break;
	}}
}
