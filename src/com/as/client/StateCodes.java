package com.as.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class StateCodes {
public static void main(String[] args) throws IOException {
	HashMap<String,String> map = new HashMap<String,String>();
	
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("StateCodes.txt")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String line;
    while ((line = reader.readLine()) != null) {
    	String[] tokens = line.split("\\s+",2);
    	//System.out.println(tokens[0]+ " " + tokens[1]);
    	map.put(tokens[1], tokens[0]);
    }
    
    
    Iterator<String> keySetIterator = map.keySet().iterator();

    while(keySetIterator.hasNext()){
      String key = keySetIterator.next();
      System.out.println("key: " + key + " value: " + map.get(key));
    }

    
    
    
}
}
