package com.javaexamples;

public class StaticCheck {
	int roll_no;
	String name;
	static String college  ="RGCET";
	static String city;
//	static{
//		city = "puducherry";
//	}
	static void getStatic(String area)
	{
		city = area;
		System.out.println("the value of city is "+ city);
	}
	 void show( int a, String text){
		 roll_no = a;
		 name = text;
		//t1.b = 30;
		System.out.println("the value of b is "+ roll_no +" "+ name +" "+ college );
		 // System.out.println(city);
	}

	public static void main(String[] args) {
	try{	
		StaticCheck obj[] = new StaticCheck[2];
		obj[0] = new StaticCheck();
		obj[1] = new StaticCheck();
		obj[2] = new StaticCheck();
		obj[0].show(12, "sethu");
		obj[1].show(12, "sethu");
		obj[2].show(12, "sethu");
	}catch(Exception e)
	{
		System.out.println("the exception is "+ e);
	}
//		obj[1].show(13, "pathi");
//		obj[2].show(14, "bala");
//		obj[3].show(15, "bharathi");
		//obj[4].show(16, "error");
		
		//StaticCheck t1 = new StaticCheck();
		//b=40;
	   // t1.show(1,"sethu");
	    getStatic("puducherry");
		//StaticCheck t2 = new StaticCheck();
	 // System.out.println(city);
	
		//t2.show(2,"pathi");
		
		//StaticCheck t3 = new StaticCheck();
//		college = "Smcec";
//		t3.show(3,"revathi");
//		StaticCheck t4 = new StaticCheck();
//		t4.show(4, "bharathi");

	}

}
