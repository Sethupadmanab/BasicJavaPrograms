package com.arraylistprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToFindSubListInList {

	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one Two three Four".split(" "));
	      System.out.println("List :"+list);
	      
	      List sublist = Arrays.asList("one Two".split(" "));
	      System.out.println("SubList :"+sublist);
	      System.out.println(
	         "indexOfSubList: " + Collections.indexOfSubList(list, sublist));
	      
	      System.out.println(
	         "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	   }

	}


