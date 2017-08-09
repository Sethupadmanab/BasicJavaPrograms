package com.vectorprograms;

import java.util.Iterator;
import java.util.Vector;

//public class Enumeration {
//
//}
 class Enumerartion{
	 public static void main(String[] args) {
		Vector v= new Vector();
		v.addElement("sethu");
		v.addElement("pathi");
		v.addElement("gayathri");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
 }

