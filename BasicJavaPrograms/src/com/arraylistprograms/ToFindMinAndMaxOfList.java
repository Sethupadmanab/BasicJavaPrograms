package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToFindMinAndMaxOfList {

	public static void main(String[] args) {
		 List l = new ArrayList();
	        l.add(1);
	        l.add(2);
	        l.add(3);
	        l.add(4);
	        l.add(5);
	        l.add(100);
	         
	        System.out.println(Collections.max(l)); 
	        System.out.println(Collections.min(l));  

	}

}
