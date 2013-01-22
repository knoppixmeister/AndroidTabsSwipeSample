package com.swsynth.androidapps.samples.swipetabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListTab extends Fragment {
	static ListTab newInstance() {
        ListTab lt = new ListTab();

        return lt;
    }

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.liststab, container, false);

		((ListView)v.findViewById(R.id.listView1)).setAdapter(new MyListAdapter(container.getContext()));

		return v;
	}
}

class MyListAdapter extends BaseAdapter {
	protected Context context = null;

	public MyListAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return 2;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup parent) {
		LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		return li.inflate(R.layout.list_item, parent, false);
	}	
}

