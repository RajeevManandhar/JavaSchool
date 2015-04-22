package com.as.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClient {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yy");
		System.out.println(dateFormat1.format(date));
		
		DateFormat dateFormat2 = new SimpleDateFormat("E dd MMM yyyy");
		System.out.println(dateFormat2.format(date));
	}
}
