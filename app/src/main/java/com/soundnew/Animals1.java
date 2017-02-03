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


public class Animals1 extends Activity implements OnClickListener{
	ImageView next,home,lion,wolf,tiger;
	 MediaPlayer playercat = MediaPlayer.create(Animals1.this,R.raw.wolfsound),playercow,playerdog;
	 private GestureDetectorCompat gestureDetectorCompat;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.animal1);
		next=(ImageView) findViewById(R.id.anext1);
		home=(ImageView) findViewById(R.id.ahome1);
		lion=(ImageView) findViewById(R.id.lionpic);
		tiger=(ImageView) findViewById(R.id.tigerpic);
		wolf=(ImageView) findViewById(R.id.wolfpic);
		next.setOnClickListener(this);
		home.setOnClickListener(this);
		lion.setOnClickListener(this);
		tiger.setOnClickListener(this);
		wolf.setOnClickListener(this);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.anext1:
			Intent wild=new Intent(this, Animals2.class);
			startActivity(wild);
			break;
		case R.id.ahome1:
			Intent birds=new Intent(this, MainActivity.class);
			startActivity(birds);
			break;
		case R.id.tigerpic:
			Animation shake = AnimationUtils.loadAnimation(Animals1.this, R.anim.wave_scale);
      		findViewById(R.id.tigerpic).startAnimation(shake); 
			Toast.makeText(getApplicationContext(), "TIGER", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals1.this,R.raw.tigersound);
	    	 playercat.start();
			break;
         case R.id.lionpic:
        	 Animation shake1 = AnimationUtils.loadAnimation(Animals1.this, R.anim.wave_scale);
	      		findViewById(R.id.lionpic).startAnimation(shake1); 
        	 Toast.makeText(getApplicationContext(), "LION", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals1.this,R.raw.lionsound);
	    	 playercat.start();
			break;
         case R.id.wolfpic:
        	 Animation shake2 = AnimationUtils.loadAnimation(Animals1.this, R.anim.wave_scale);
	      		findViewById(R.id.wolfpic).startAnimation(shake2); 
        	 Toast.makeText(getApplicationContext(), "WOLF", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Animals1.this,R.raw.wolfsound);
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
	        		 startActivity(new Intent(Animals1.this, Animals2.class));
	        		
	        		 }
		           else  if(event1.getX() < event2.getX()){
		        	// Toast.makeText(getApplicationContext(), "right", 0).show();	 
		          
		        	 
		        	 
		        	 startActivity(new Intent(Animals1.this, Birds2.class));
		         }
//	        	{
//	             Intent intent = new Intent(
//	            		 Animals1.this, Animals2.class);
//	             startActivity(intent);
//	         }
//	        	//right 
//	        	else if(event2.getX() > event1.getX()){
//			             Intent intent = new Intent(
//			            		 Animals1.this, Birds2.class);
//			             startActivity(intent);
//			         }

	            return true;
	        }

			private void overridePendingTransition(int lefttoright,
					int righttoleft) {
				// TODO Auto-generated method stub
				
			}}
}
