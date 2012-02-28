package com.dodobear.clock;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ClockActivity extends Activity {
	
	private ListView listView;
	private ArrayList<ClockBean> clockList;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}