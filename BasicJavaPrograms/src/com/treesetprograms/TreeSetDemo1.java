package com.treesetprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		 TreeSet t = new TreeSet(new MyComparator2());
		   t.add(new String("A"));
		   t.add(new String("Z"));
		   t.add(new String("L"));
		   t.add(new String("B"));
		  // t.add(null);
		   System.out.println(t); 
		   
	}

}
class MyComparator2 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		 String  i1 = (String)obj1;
		 String  i2 = (String)obj2;
		  
		   return i1.compareTo(i2);
	}
}
