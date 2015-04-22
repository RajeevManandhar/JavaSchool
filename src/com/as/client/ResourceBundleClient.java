package com.as.client;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundleClient {


	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("com.as.client.Company");
		Enumeration <String> keys = rb.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = rb.getString(key);
			System.out.println(key + ": " + value);
		}
	}

}
