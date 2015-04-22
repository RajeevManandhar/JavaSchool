package com.as.client;

import java.util.ArrayList;

import com.as.util.State;

public class StateArray {
	public static void main(String[] args) {

		ArrayList<State> list = new ArrayList<State>();

		list.add(new State("California","CA","Sacramento"));
		list.add(new State("Utah","UT","Salt Lake City"));
		list.add(new State("New York","NY","New York City"));
		list.add(new State("Oregon","OR","Portland"));
		list.add(new State("Idaho","ID","Boise"));
		list.add(new State("Arizona","AZ","Phoenix"));
		list.add(new State("Montana","MT","Billings"));
		list.add(new State("Alabama","AL","Montgomery"));
		list.add(new State("Arkansas","AR","Little Rock"));
		list.add(new State("Colorado","CO","Denver"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
