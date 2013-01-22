package com.swsynth.androidapps.samples.swipetabs;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.viewpagerindicator.TabPageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class MainActivity extends SherlockFragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock_Light);

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		FragmentPagerAdapter adapter = new GoogleMusicAdapter(getSupportFragmentManager());

		ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(pager);
	}

	class GoogleMusicAdapter extends FragmentPagerAdapter {
        public GoogleMusicAdapter(FragmentManager fm) {
        	super(fm);
        }

        @Override
        public Fragment getItem(int position) {
        	Log.e("AAAAA", "POS getItem: "+position);

            //return TestFragment.newInstance(CONTENT[position % CONTENT.length]);

        	if(position == 1) return TextTab.newInstance();
        	else return //TestFragment.newInstance("tttttt");
        				ListTab.newInstance();
        }

        @Override
        public CharSequence getPageTitle(int position) {
        	Log.e("AAAAA", "POS getPageTitle: "+position);
        	
        	//return CONTENT[position % CONTENT.length].toUpperCase();

        	return "aasd sdasd";
        }

        @Override
        public int getCount() {
        	return //CONTENT.length;
        		  3;
        }
    }
}
