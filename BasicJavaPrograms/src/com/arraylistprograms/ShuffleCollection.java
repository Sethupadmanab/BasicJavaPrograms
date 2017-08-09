package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCollection {

	public static void main(String[] args) {
		  ArrayList<String> obj = new ArrayList<String>();
	      obj.add("A");
	      obj.add("E");
	      obj.add("I");
	      obj.add("O");
	      obj.add("U");
	      Collections.shuffle(obj);
	      System.out.println(obj);

	}

}
