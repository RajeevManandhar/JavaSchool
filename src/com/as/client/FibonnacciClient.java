package com.as.client;
import java.util.ArrayList;
import java.util.Scanner;

import com.as.util.Fibonacci;
public class FibonnacciClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter number for Fibonacci Series");
		n=scan.nextInt();
		ArrayList<Integer> fibonacciList = new ArrayList<Integer>(n);
		
		Fibonacci series = new Fibonacci();
		fibonacciList = series.getFibonacciSeries(n);
		
		for(int i =0; i<fibonacciList.size(); i++){
			System.out.println(fibonacciList.get(i));
		}
	}
}
