package com.soundnew;
import java.util.Timer;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
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

public class Pets1 extends Activity implements OnClickListener{
	ImageView next,home,cat,cow,dog;
	private Timer t;
	private GestureDetectorCompat gestureDetectorCompat;
	 MediaPlayer playercat,playercow,playerdog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pet1);
		next=(ImageView) findViewById(R.id.pnext1);
		home=(ImageView) findViewById(R.id.phome1);
		cat=(ImageView) findViewById(R.id.catpic);
		cow=(ImageView) findViewById(R.id.cowpic);
		dog=(ImageView) findViewById(R.id.dogpic);
		next.setOnClickListener(this);
		home.setOnClickListener(this);
		cat.setOnClickListener(this);
		cow.setOnClickListener(this);
		dog.setOnClickListener(this);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
//blinkcat();
//		blinkcow();
//		blinkdog();
	}
		
//		t = new Timer();
//	    t.scheduleAtFixedRate(new TimerTask() {
//	        @Override
//	        public void run() {
//	            // TODO Auto-generated method stub
//	            runOnUiThread(new Runnable() {
//	                public void run() {
//	                	Animation shake = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
//	            		findViewById(R.id.catpic).startAnimation(shake);     
//	            		Animation shake1 = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
//	            		findViewById(R.id.cowpic).startAnimation(shake1);
//	            		Animation shake2 = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
//	            		findViewById(R.id.dogpic).startAnimation(shake2);}
//	            });
//	        }
//	    }, 1000, 1000);


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.pnext1:
			Intent wild=new Intent(this, Pets2.class);
			startActivity(wild);
			break;
		case R.id.phome1:
			Intent birds=new Intent(this, MainActivity.class);
			startActivity(birds);
			break;
		case R.id.cowpic:
			Animation shake = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
    		findViewById(R.id.cowpic).startAnimation(shake);  
			Toast.makeText(getApplicationContext(), "COW", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Pets1.this,R.raw.cowsound);
	    	 playercat.start();
			break;
         case R.id.catpic:
        	 Animation shake1 = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
     		findViewById(R.id.catpic).startAnimation(shake1);
        	 Toast.makeText(getApplicationContext(), "CAT", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Pets1.this,R.raw.catsounds);
	    	 playercat.start();
			break;
         case R.id.dogpic:
        	 Animation shake2 = AnimationUtils.loadAnimation(Pets1.this, R.anim.wave_scale);
     		findViewById(R.id.dogpic).startAnimation(shake2);
        	 Toast.makeText(getApplicationContext(), "DOG", Toast.LENGTH_SHORT).show();
	    	 playercat=MediaPlayer.create(Pets1.this,R.raw.dogsound);
	    	 playercat.start();
	break;
	}
}
	
	
    
//    private void blinkcat(){
//        final Handler handler = new Handler();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//            int timeToBlink = 500;    //in milissegunds
//            try{
//            	Thread.sleep(timeToBlink);
//        	}catch (Exception e) {
//        		
//        	}
//            handler.post(new Runnable() {
//                @Override
//                    public void run() {
//                	cat=(ImageView) findViewById(R.id.catpic);
//                    if(cat.getVisibility() == View.VISIBLE){
//                    	cat.setVisibility(View.INVISIBLE);
//                    }else{
//                    	cat.setVisibility(View.VISIBLE);
//                    }
//                    blinkcat();
//                }
//                });
//            }}).start();
//   }
//    private void blinkcow(){
//        final Handler handler = new Handler();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//            int timeToBlink = 500;    //in milissegunds
//            try{
//            	Thread.sleep(timeToBlink);
//        	}catch (Exception e) {
//        		
//        	}
//            handler.post(new Runnable() {
//                @Override
//                    public void run() {
//            		cow=(ImageView) findViewById(R.id.cowpic);
//                    if(cow.getVisibility() == View.VISIBLE){
//                    	cow.setVisibility(View.INVISIBLE);
//                    }else{
//                    	cow.setVisibility(View.VISIBLE);
//                    }
//                    blinkcow();
//                }
//                });
//            }}).start();
//   }
//    
//    private void blinkdog(){
//        final Handler handler = new Handler();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//            int timeToBlink = 500;    //in milissegunds
//            try{
//            	Thread.sleep(timeToBlink);
//        	}catch (Exception e) {
//        		
//        	}
//            handler.post(new Runnable() {
//                @Override
//                    public void run() {
//            		dog=(ImageView) findViewById(R.id.dogpic);
//                    if(dog.getVisibility() == View.VISIBLE){
//                    	dog.setVisibility(View.INVISIBLE);
//                    }else{
//                    	dog.setVisibility(View.VISIBLE);
//                    }
//                    blinkdog();
//                }
//                });
//            }}).start();
//   }
    
	
	
	@Override
	 public boolean onTouchEvent(MotionEvent event) {
	  this.gestureDetectorCompat.onTouchEvent(event);
	        return super.onTouchEvent(event);
	 }

	 class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
	        @Override
	        public boolean onFling(MotionEvent event1, MotionEvent event2, 
	                float velocityX, float velocityY) {
	        //left 
	         if(event2.getX() < event1.getX()) {
//	             Intent intent = new Intent(
//	            		 Pets1.this, Pets2.class);
//	             startActivity(intent);
	             startActivity(new Intent(Pets1.this, Pets2.class));
	        // Toast.makeText(getApplicationContext(), "left", 0).show();
	         }
	         else  if(event1.getX() < event2.getX()){
	        	// Toast.makeText(getApplicationContext(), "right", 0).show(); 
	        	 startActivity(new Intent(Pets1.this, MainActivity.class));
	         }
	          
	        //right 
//	         else if(event2.getX() > event1.getX()){
//		             Intent intent = new Intent(
//		            		 Pets1.this, MainActivity.class);
//		             startActivity(intent);
//		              
//		            
//		         }

	            return true;
	        }

	
	        
	        
	 }}
			

