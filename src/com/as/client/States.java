package com.as.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class States {
public static void main(String[] args) throws IOException {
	ArrayList<String> list = new ArrayList<String>();
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("states.txt")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String line;
	// add to arraylist
	int count =1;
    while ((line = reader.readLine()) != null) {
    	list.add(line);
    	System.out.println("Added to list : "  + (count++) +" "+ line);
    }
    
    System.out.println("\n////////////////   HashSet Operation  ////////////// ");
    long startTime1 = System.currentTimeMillis();
    HashSet<String> hashset = new HashSet<String>();
    System.out.println(list.size());
    for(int i =0 ; i < list.size(); i++){
    	  long total = 0;
          for (int j = 0; j < 100000; j++) {
        	  hashset.add(list.get(i));
             total += j;
          }

    	
    }
    System.out.println(hashset);
    System.out.println("HashSet Size : " + hashset.size());
    
    System.out.println( "Show that duplicates cannot be added." );
    hashset.add("Utah");
    hashset.add("California");
    hashset.add("Idaho");
    System.out.println("HashSet Size : " + hashset.size());

    long stopTime1 = System.currentTimeMillis();
    long elapsedTime1 = stopTime1 - startTime1;
    System.out.println("Elapsed time for HashSet Operation " +elapsedTime1);
    

    
    System.out.println("\n////////////////   TreeSet Operation  ////////////// ");
    
    long startTime2 = System.currentTimeMillis();
    TreeSet<String> treeset = new TreeSet<String>();
    System.out.println(list.size());
    for(int i =0 ; i < list.size(); i++){
    	  long total = 0;
          for (int j = 0; j < 100000; j++) {
        	  treeset.add(list.get(i));
             total += j;
          }

    	
    }
    System.out.println(treeset);
    System.out.println("TreeSet Size : " + treeset.size());
    
    System.out.println( "Show that duplicates cannot be added." );
    treeset.add("Utah");
    treeset.add("California");
    treeset.add("Idaho");
    System.out.println("TreeSet Size : " + treeset.size());

    long stopTime2 = System.currentTimeMillis();
    long elapsedTime2 = stopTime2 - startTime2;
    System.out.println("Elapsed time for TreeSet Operation " +elapsedTime2);
    
   
}
}
