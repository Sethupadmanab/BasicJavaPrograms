package com.treesetprograms;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		 TreeSet t = new TreeSet(); // allow duplication
		                   		//not allow any null value
		   t.add("A");          
		   t.add("A");
		   t.add("A");
		   t.add("Z");
		   t.add("L");
		   t.add("B");
		  // t.add(null); 
		   System.out.println(t); // NullPointerException   Because it follows natural sorting order by default comparable() will be not allow null value.
		   

	}

}
