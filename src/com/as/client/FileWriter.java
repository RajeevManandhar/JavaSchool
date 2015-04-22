package com.as.client;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriter {
	public static void main(String[] args) throws UnsupportedEncodingException,
			IOException {

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("info.txt", true)))) {
			String info = GetInfo();
			writer.write(info);
			writer.close();
		}
	}

private static String GetInfo(){
	String info="";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your Full Name");
	String name = scan.nextLine();
	System.out.println("Enter you Phone Number");
	String phone = scan.nextLine();
	info = name + "\t" + phone +"\n";
	return info;
}

}