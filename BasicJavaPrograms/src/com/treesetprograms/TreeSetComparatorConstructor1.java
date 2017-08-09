package com.treesetprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
//class Student implements Comparable<Student> 
//{
//	String name;
//	int age;
//	Student(String name, int age)
//	{
//		this.name = name;
//		this.age = age;
//	}
//	public int compareTo(Student i2) {
//		  if(age == i2.age)
//		  {
//			  return 0; 
//		  }
//		  else if(age > i2.age)
//		  {
//			  return 1;
//		  }
//		  else
//		  {
//			  return -1;
//		  }
//		
//	}
//}
public class TreeSetComparatorConstructor1 {
//
	public static void main(String[] args) {
//		TreeSet list = new TreeSet(new MyComparator1());
//		list.add(new Integer(10));
//		list.add(new Integer(30));
//		list.add(new Integer(5)); 
//		Iterator itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			
//		}
		ArrayList t = new ArrayList(); //comparator constructor
			//here the object is integer
		// t.add(new Student("sethu",23));
		// t.add(new Student("pathi",37));
			 t.add(new StringBuffer("B"));
			 t.add(new StringBuffer("A"));
			 t.add(new StringBuffer("C"));
			 t.add(new StringBuffer("G"));
		  Collections.sort(t);
//		   for(Student itr : t)
//		   {
//			   System.out.println(itr.name+" "+itr.age);
//		   }
		 Iterator itr = t.iterator();
		 while(itr.hasNext())
		 {
			  
			 StringBuffer str =(StringBuffer)itr.next();
		  System.out.println(str);  
//			System.out.println(str.name+" "+str.age);   
		 }
		 
			// System.out.println(t);

		}

	}
//    class MyComparator1 implements Comparator
//    {
//    	public int compare(Object obj1 , Object obj2)
//    	{    
//    		Integer i1 = (Integer)obj1;
//    		Integer i2 = (Integer)obj2;
//    		return i1.compareTo(i2); 
//    	}
//    }
//	class MyComparator1 implements Comparator
//	{
//		public int compare(Object obj1 , Object obj2)
//		{
//			Student i1 = (Student)obj1;
//			Student i2 = (Student)obj2;
////		   String i1 =  obj1.toString();
////		   String i2 = obj2.toString();
//		 return i1.compareTo(i2);   
//		  // return -i1.compareTo(i2);
//		  // return i2.compareTo(i1);
//		  // return -i2.compareTo(i1);
//		 // return +1;
//		// return -1;
//		// return 0;
//		   
// 
//
//	}

//ClassCastException because stringBuilder and StringBuffer can't cast to Comparable for Tree set.
