package com.as.client;
import com.as.util.*;

public class BasicCalcClient {

public static void main(String[] args){
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		BasicCalc calc = new BasicCalc();
		int var1 = calc.add(i,j);
		int var2 = calc.subtract(i,j);
		int var3 = calc.multiply(i,j);
		int var4 = calc.div(i,j);
		
		System.out.println("The sum is : " + var1);
		System.out.println("The diff is : " + var2);
		System.out.println("The multiplication is : " + var3);
		System.out.println("The division is : " + var4);
	}

}
