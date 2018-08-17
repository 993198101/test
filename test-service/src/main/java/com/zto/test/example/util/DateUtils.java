package com.zto.test.example.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
	
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * date转string
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return format.format(date);
	}
	
	/**
	 * 获取当天0点时间
	 * @return
	 */
	public static String getZero() {
		int rawOffset = TimeZone.getDefault().getRawOffset();
		long ts = System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24)-rawOffset;
		return format.format(new Date(ts));
	}
	
	/**
	 * 获取当前时间前一个月的年月
	 * @return
	 */
	public static String getYearAndMonth() {
		Calendar  item = Calendar.getInstance();
		int month = item.get(Calendar.MONTH);
		int year = item.get(Calendar.YEAR);
		if(month ==0) {
			year-=1;
			month = 12;
		}
		if(month<10) {
			return year+",0"+month;
		}else {
			return year+","+month;
		}
	}
}
