package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertCollectionToArray {

	 
		public static void main(String[] args){    
			List<String>  list = new ArrayList<String> ();
		      list.add("This "); 
		      list.add("is "); 
		      list.add("a ");
		      list.add("good ");
		      list.add("program");
		      System.out.println(list.size());
		      String[] s1 = list.toArray(new String[list.size()]); 
		      System.out.println(s1.length);
		      for(String value : s1)
		      {
		    	  System.out.println(value);
		      }
	             
		      
		}

}
