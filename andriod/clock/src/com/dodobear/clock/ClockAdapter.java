package com.dodobear.clock;

import java.util.ArrayList;

import android.content.Context;
import android.widget.BaseAdapter;

public class ClockAdapter extends BaseAdapter {

	private Context mContext;
	private ArrayList<ClockBean> appInfos;

	public ClockAdapter(Context c) {
		this.mContext = c;
	}

	public ClockAdapter(Context c, ArrayList<ClockBean> appInfos) {
		this.mContext = c;
		this.appInfos = appInfos;
	}

	public int getCount() {
		return appInfos.size();
	}

	public Object getItem(int position) {
		return appInfos.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	/**
	 * get view
	 */
	public View getView(int position, View convertView, ViewGroup parent) {
		if (appInfos == null) {
			return null;
		}
		if (convertView == null) {
			AppView appView = new AppView(mContext);
			appView.updateView(appInfos.get(position));
			convertView = appView;
		} else {
			((AppView) convertView).updateView(appInfos.get(position));
		}
		return convertView;

	}

}
