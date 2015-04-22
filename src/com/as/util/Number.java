package com.as.util;

public class Number {

	public Boolean IsInteger(String str) {
		try {
			int n = Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public Boolean IsOddNumber(String str) {
		try {
			int n = Integer.parseInt(str);
			if (n % 2 == 1)
				return true;
			else
				return false;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public Boolean IsEvenNumber(String str) {
		try {
			int n = Integer.parseInt(str);
			if (n % 2 == 0)
				return true;
			else
				return false;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public Boolean IsPrimeNumber(String str) {
		try {
			int n = Integer.parseInt(str);
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
