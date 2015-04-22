package com.as.client;

public class NumberGenerator {

	public static void main(String[] args) {

		System.out.println("Generate 1000 numbers upto 1000");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++)
				System.out.print((int) (Math.random() * 1000) + "\t");
			System.out.println();
		}

		System.out.println("Generate 1000 multiple of 5 and less than 1000");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++)
				System.out.print(((int) (Math.random() * (1000 / 5)) * 5)
						+ "\t");
			System.out.println();
		}

		System.out.println("Generate 1000 odd number upto 1000");
		for (int i = 0; i < 1000; i++) {
			int number = (int) (Math.random() * (1000));
			if (number % 2 != 1){
				i--;
				continue;
			}
			if (i!=0 && ((i + 10) % 100 == 0))
				System.out.println();
			System.out.print(number + "\t");
			
		}
	}
}
