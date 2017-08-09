package com.treesetprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorConstructor {

	public static void main(String[] args) {
		 TreeSet t = new TreeSet( new MyComparator()); //comparator constructor
		//here the the object is integer
		 t.add(10);
		 t.add(0);
		 t.add(15);
		 t.add(20);
		 t.add(20);
		 System.out.println(t);

	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1 , Object obj2)
	{
		Integer i1 = (Integer)obj1;
	   Integer i2 = (Integer)obj2;
	   //return i1.compareTo(i2);
	   return -i1.compareTo(i2);
	  // return i2.compareTo(i1);
	  // return -i2.compareTo(i1);
	 // return +1;
	// return -1;
	// return 0;
	   
//----------	or else we can do the below code as well   
//	   if(i1 < i2)
//	   {
//		   return +1;
//	   }
//	   else if(i1 > i2){
//	   return -1; 
//	   }
//	   else{
//		   return 0;
//	   }
	}
}
