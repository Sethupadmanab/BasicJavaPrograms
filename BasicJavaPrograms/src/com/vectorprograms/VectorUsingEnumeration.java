package com.vectorprograms;

import java.util.Vector;
import java.util.Enumeration;

public class VectorUsingEnumeration {

	public static void main(String[] args) {
		 Vector v =new Vector();
		 for(int i=0; i<=10; i++)
		 {
			 v.addElement(i);
		 }
		 System.out.println(v);
		  Enumeration enm =  v.elements();
		  while(enm.hasMoreElements())
		  {
			  Integer i = (Integer) enm.nextElement();
			  if(i%2 == 0)
			  {
				  System.out.println(i);
			  }
		  }
		
		 System.out.println(v);
		// System.out.println(enm.getClass().getName());
		 
	

	}

}
