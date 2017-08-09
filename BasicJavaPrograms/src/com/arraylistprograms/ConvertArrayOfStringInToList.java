package com.arraylistprograms;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConvertArrayOfStringInToList {

	public static void main(String[] args) {
		 String obj[] = new String[6];
		 obj[0]="I";
		 obj[1]="am";
		 obj[2]="working";
		 obj[3]="as";
		 obj[4]="a";
		 obj[5]="Software Engineer";
		 
		List<String> list = Arrays.asList(obj);
		 System.out.println(list);
		 for(String str : list)
		 {
			 System.out.print(str+" "); // we will get each output one by one
		 }
		    // or else follow the below iterator concept to get each output one by one.
//		 Iterator itr =list.iterator();
//		 while(itr.hasNext())
//		 {
//			 System.out.print(itr.next()+" ");
//		 }

	}

}
