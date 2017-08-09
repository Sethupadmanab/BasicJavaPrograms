package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 

public class ArrayListUsingIterator {

	public static void main(String[] args) {
		 List<Integer>  al = new LinkedList<Integer>();
		 
		 for(int i=0; i<=10; i++)
		 {
			 al.add(i);
		 }
		  
		 System.out.println(al);
		   
		  
//		 String[] s1 =   al.toArray(new String[al.size()]); 
//		 
//		 for(String s : s1)
//		 {
//			 System.out.println(s);
//		 }
		 
		 
		 
		  Iterator itr =  al.iterator();
		   
		  while(itr.hasNext())
		  {    
			  
			 // System.out.println(itr.next());
			    
			  Integer i =(Integer) itr.next();
			 System.out.println("the value of  i is" +i);
 		  if(i%2 == 0)
 			  {
 				  System.out.println(i);
 			  }
 			  else{
 				  itr.remove();
 			  }
 	 
		  }
//		  
		  System.out.println(al);
		 // System.out.println(itr.getClass().getName());
	}

}


/*int n =5;
for(int i=4;i<=4;i--){
	 if(i<=4 && i>0)
	 {
		 n=n*i;
		 continue;
	 }
}
System.out.println(n);*/

