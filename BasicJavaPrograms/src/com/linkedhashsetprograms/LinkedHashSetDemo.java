package com.linkedhashsetprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		 LinkedHashSet<String> s = new LinkedHashSet<String>();
		 s.add("sethu");
		 s.add("senthil");
		 s.add("pradeep");
		 s.add("bindu");
		// s.add(10);
		 s.add(null); // only one null value will be allowed.
		 s.add(null);
		 System.out.println(s.add("senthil"));
		 System.out.println(s);
		 Iterator itr = s.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next()); 
		 }
		
		 System.out.println(s);
	}

}
