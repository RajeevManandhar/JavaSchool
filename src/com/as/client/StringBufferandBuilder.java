package com.as.client;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		// String buffer is thread safe but slower
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcd");
		buffer.append("efgh");
		buffer.append("12345678901234567890");
		System.out.println("String Buffer is "+ buffer);
		buffer.delete(5, 7);
		System.out.println("String Buffer is "+ buffer);
		
		// String builder is not tread safe but faster
		StringBuilder builder = new StringBuilder();
		builder.append("abcd");
		builder.append("efgh");
		builder.append("12345678901234567890");
		System.out.println("String builder is "+ builder);
		builder.delete(5, 7);
		System.out.println("String Builder is "+ builder);
		
		
		
	}
}
