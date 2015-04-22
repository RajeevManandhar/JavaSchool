package com.as.util;

import java.util.ArrayList;

public class Fibonacci {
ArrayList<Integer> list;
	public ArrayList<Integer> getFibonacciSeries(int n){
		list = new ArrayList<Integer>(n);
		list.add(0);
		list.add(1);
		for(int i = 2; i<n; i++){
			int number = list.get(i-2)+list.get(i-1);
			list.add(number);
		}
		
		return list;
	}
}
