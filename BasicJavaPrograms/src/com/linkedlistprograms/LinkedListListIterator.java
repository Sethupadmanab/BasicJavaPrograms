package com.linkedlistprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListListIterator {

	public static void main(String[] args) {
		 
      LinkedList l = new LinkedList();
      l.add("sethu");
      l.add("pathi");
      l.add("gay");
      l.add("bharathi");
      System.out.println(l);
      ListIterator ltr = l.listIterator();
      while(ltr.hasNext())
      {
    	  String s =(String)ltr.next();
    	  if(s.equals("pathi"))
    	  {
    		 ltr.add("check");
    	  }
    	  else if(s.equals("gay"))
    	  {
    		  ltr.add("thri");
    	  }
    	  else if(s.equals("bharathi"))
    	  {
    		  ltr.set("Balaguru");
    	  }
      }
      
      System.out.println(l);
     // System.out.println(ltr.getClass().getName());
      
	}

}
