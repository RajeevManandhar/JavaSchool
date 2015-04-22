package com.as.client;

import java.util.Scanner;
import com.as.util.Number;

public class NumberClient {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number");
	String str = scan.next();
	
	Number num = new Number();
	
	if(num.IsInteger(str))
		System.out.println(str + " is an Integer");
	else
		System.out.println(str + " is not an Integer");

	if(num.IsEvenNumber(str))
		System.out.println(str + " is an Even Number");

	if(num.IsOddNumber(str))
		System.out.println(str + " is an Odd Number");

	if(num.IsPrimeNumber(str))
		System.out.println(str + " is a Prime Number");
	
	
}
}
