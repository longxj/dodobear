package com.dodobear.clock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ClockView extends RelativeLayout {

	private Context mContext;
	private ImageButton useStatusButton, deleteButton;
	private TextView clockText, daysText;

	/**
	 * 
	 * @param context
	 */
	public ClockView(Context context) {
		super(context);
		this.mContext = context;
		initilize(context);
	}

	/**
	 * 
	 * @param c
	 */
	public void initilize(Context c) {
		this.mContext = c;
		View view = LayoutInflater.from(this.mContext).inflate(
				R.layout.clocklistitem, null);
		useStatusButton = (ImageButton) view
				.findViewById(R.id.use_status_button);
		clockText = (TextView) view.findViewById(R.id.clock_text);
		daysText = (TextView) view.findViewById(R.id.days_text);
		deleteButton = (ImageButton) view.findViewById(R.id.delete_button);
		addView(view);
	}

	/**
	 * 
	 * @param ai
	 */
	public void updateView(ClockBean ai) {
		clockText.setText("7:30 work go go");
		daysText.setText(ai.GetDaysStr());
	}

}
