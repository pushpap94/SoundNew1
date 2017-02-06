package com.soundnew;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity{
ImageView pets,birds,animals,birdsindex,petsindex,animalindex;
private ViewPager viewPager;
private TabsPagerAdapter mAdapter;
//private ActionBar actionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_index);
		pets=(ImageView) findViewById(R.id.pindex);
		birds=(ImageView) findViewById(R.id.bindex);
		animals=(ImageView) findViewById(R.id.aindex);
		birdsindex=(ImageView) findViewById(R.id.birdsindex);
		petsindex=(ImageView) findViewById(R.id.petsindex);
		animalindex=(ImageView) findViewById(R.id.animalindex);


		pets.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent=new Intent(MainActivity.this, Pets1.class);
				startActivity(intent);

			}
		});

		birds.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(MainActivity.this, Birds1.class);
				startActivity(intent);
			}
		});

		animals.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(MainActivity.this, Animals1.class);
				startActivity(intent);
			}
		});

		petsindex.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(MainActivity.this, Pets1.class);
				startActivity(intent);
			}
		});

		birdsindex.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(MainActivity.this, Birds1.class);
				startActivity(intent);
			}
		});

		animalindex.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(MainActivity.this, Animals1.class);
				startActivity(intent);
			}
		});

	}



//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//			break;
//		case R.id.pindex:
//			Intent pet=new Intent(this, Pets1.class);
//			startActivity(pet);
//			break;
//		case R.id.animalindex:
//			Intent wild1=new Intent(this, Animals1.class);
//			startActivity(wild1);
//			break;
//		case R.id.birdsindex:
//			Intent birds1=new Intent(this, Birds1.class);
//			startActivity(birds1);
//			break;
//		case R.id.petsindex:
//			Intent pet1=new Intent(this, Pets1.class);
//			startActivity(pet1);
//			break;
//	}}switch(v.getId()){
//		case R.id.aindex:
//			Intent wild=new Intent(this, Animals1.class);
//			startActivity(wild);
//			break;
//		case R.id.bindex:
//			Intent birds=new Intent(this, Birds1.class);
//			startActivity(birds);
//
}




