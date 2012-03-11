package com.dodobear.clock;

import java.util.Calendar;

public class ClockBean {

	public static char DAY_MONDAY = 1;
	public static char DAY_TUESDAY = 2;
	public static char DAY_WEDNESDAY = 4;
	public static char DAY_THURSDAY = 8;
	public static char DAY_FRIDAY = 16;
	public static char DAY_SATURDAY = 32;
	public static char DAY_SUNDAY = 64;
		
	public Calendar calendar;
	public String title;
	public boolean isOn;
	public char days;
	public int shakeTimes;
	
	public String GetDaysStr(){
		String daysStr = "";
		
		if((days & DAY_MONDAY) != 0){
			daysStr += "一";
		}
		
		if((days & DAY_TUESDAY) != 0){
			daysStr += "二";
		}
		
		if((days & DAY_WEDNESDAY) != 0){
			daysStr += "三";
		}
		
		if((days & DAY_THURSDAY) != 0){
			daysStr += "四";
		}
		
		if((days & DAY_FRIDAY) != 0){
			daysStr += "五";
		}
		
		if((days & DAY_SATURDAY) != 0){
			daysStr += "六";
		}
		
		if((days & DAY_SUNDAY) != 0){
			daysStr += "日";
		}
		
		return daysStr;
	}
}
