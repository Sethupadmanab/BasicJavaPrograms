package com.linkedlistprograms;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		  
		 l.add("sethu");
		 l.add("sethu");
		 //l.add(10);
		 l.add("pathi");
		 l.add(null);
		 l.set(0, "bharathi");
		 l.add(0, "venkat");
		// l.addFirst("Gayathri");
		System.out.println(l); 
	  String s[] = l.toArray(new String[l.size()]);
//		for(String l1 : s)
//	  {
//		  System.out.println(l1);
//	  }
		// or we can use  listIterator() method 
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			String names=(String)itr.next();
			 System.out.println(names);
		}

	}

}
