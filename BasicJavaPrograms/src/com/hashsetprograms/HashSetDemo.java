package com.hashsetprograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set h = new HashSet();
		h.add("sethu");
		h.add("pathi");
		h.add("Gayathri");
		h.add("bala"); 
		h.add(null); // only one null value is accepted.
		System.out.println(h.add(null));//returns false
		System.out.println(h.add(null));//returns false
		System.out.println(h.add(null));//returns false
		System.out.println(h.add("sethu"));//returns false
		System.out.println(h.add("bala"));//returns false
		System.out.println(h.add("ravi")); //  returns True bcoz it's a new value.
		System.out.println(h);

	}

}
