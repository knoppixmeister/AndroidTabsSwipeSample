package com.swsynth.androidapps.samples.swipetabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextTab extends Fragment {
	static TextTab newInstance() {
        return new TextTab();
    }

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.texttab, container, false);
		((TextView)v.findViewById(R.id.textView1)).setText(" sadhsgdhasdhadhasgd hsgdh ghsag dhgasdh adhasg dhgsdgad");

		return v;
	}
}
