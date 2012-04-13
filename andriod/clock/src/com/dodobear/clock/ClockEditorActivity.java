package com.dodobear.clock;

import java.util.ArrayList;
import java.util.Calendar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class ClockEditorActivity extends Activity {

	private ClockBean clockBean;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clockeditor);
		initComponents();
	}

	public void initComponents(){
		
	}
	
	private void loadData(){
	}
	
}