package com.dodobear.clock;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class ClockActivity extends Activity {

	private ListView listView;
	private ArrayList<ClockBean> clockList;

	private Context mContext;
	private ClockAdapter clockAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initComponents();
	}

	public void initComponents() {
		this.mContext = this;
		listView = (ListView) findViewById(R.id.listView);
		clockList = new ArrayList<ClockBean>();
		clockAdapter = new ClockAdapter(mContext, clockList);
		listView.setAdapter(clockAdapter);
		
		//load test data
		loadData();
	}
	
	private void loadData(){
		ClockBean test = new ClockBean();
		test.days = 127;
		clockList.add(test);
		test = new ClockBean();
		clockList.add(test);
	}
	
}