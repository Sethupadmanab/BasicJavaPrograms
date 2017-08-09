package com.javaexamples;

class A
{
	void show(){
		System.out.println(" A is working");

	}
	void getName(Object ob){
		System.out.println("normal getname working " + ob);
	}
}
class B extends A{
	 
	void show()
	{
		System.out.println(" B is working");
	}
	void getName(String ob1){
		System.out.println(" getname1 is  working " + ob1);
	}
}
	
class SampleDownCasting{
	 public static void main(String[] args) {
		A obj = new B();
		obj.show();
		obj.getName("sethu");
		   
	}
}
