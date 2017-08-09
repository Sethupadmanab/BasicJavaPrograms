package com.arraylistprograms;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 ArrayList  al = new ArrayList();
		 al.add("10");
//		 al.add("A1");
//		 al.add("A2");
//		 al.add("A3");
//		 al.add("A4");
		 al.add(15);
//		 al.add("B");
		 al.add(null);
		 al.add(null);
		 System.out.println(al);
		 al.remove(0);
		 al.remove(1);
		// al.remove(2);
		 System.out.println(al.size());
		 System.out.println(al);
		 al.add(1,40);
		 System.out.println(al);
		 al.add(null);
		 System.out.println(al);
//		 
		 al.add("90");
		 al.add("");
		 al.add("");
		 al.add("90");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("");
		 al.add("hundred");
		 System.out.println(al.size());
		 System.out.println(al.set(19, "thousand"));
		 System.out.println(al.get(19));
		 System.out.println(al);
		 
		 

	}

}
