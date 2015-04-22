package com.as.util;

public class Room {

	int lenght;
	int width;
	int height;
	
	public Room(int l, int w, int h){
		
		lenght = l;
		width = w;
		height = h;
	}
	
	public int getArea(){
		
		return lenght*width;
	}
	
	public int getVolume(){
		
		return lenght*width*height;
	}
}
