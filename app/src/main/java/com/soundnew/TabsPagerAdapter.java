package com.soundnew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {
	//final int PAGE_COUNT = 7;
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new MainFragment();
		case 1:
			// Games fragment activity
			return new PetsFragment1();
		case 2:
			// Games fragment activity
			return new PetsFragment2();
		case 3:
			// Movies fragment activity
			return new BirdsFragment1();
		case 4:
			// Movies fragment activity
			return new BirdsFragment2();
		case 5:
			// Movies fragment activity
			return new AnimalFragment1();
		case 6:
			// Movies fragment activity
			return new AnimalFragment2();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 7;
	}

}
