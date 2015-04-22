package com.as.client;

public class Array {
	public static void main(String[] args) {
		int array[] = new int[10];
		for(int i=0; i < 10; i++){
			array[i] = ((int)(Math.random()*100));
		}
		
		for(int i=0; i < 10; i++){
			System.out.println("array[" + i + "] is " +array[i]);
		}
	}

}
