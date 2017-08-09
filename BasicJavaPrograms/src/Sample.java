//interface A1
// { 
////	 static int draw(){
////		 return 1;
////	 }
//	 
// }
// interface A2
// {
//	 int get();
// }
// interface A3{
//	 String name();
// }
// interface B3 extends A1,A2,A3
// {
//	 void print();
// }
// class Sample implements B3{
//	 
//		public int get() {
//			 
//			return 0;
//		}
// public String name() {
//			 
//			return null;
// } 
// public void print() {
//		System.out.println("working");
//		
//	}
//public static void main(String[] args) {
//		 
//		 
//		 
//		A1 obj = new Sample();
//		  
////		System.out.println(obj.get());
////		System.out.println(obj.name());
////		obj.print();
////	 
//	}
//
//	
//	}
 
   //Scenario for Interface End...
 
 
    // Scenario Example Start...

//		Scenario Example End...
 
   // Scenario for Operators start..
//class Sample{
//	public static void main(String[] args) {
//		int a=10;  
//		int b=5;  
//		int c=11;  
//		System.out.println(a<b||a<c);//true || true = true  
//		System.out.println(a>b|a<c);//true | true = true  
//		//|| vs |  
//		System.out.println(a<b||a++<c);//true || true = true  
//		System.out.println(a);//10 because second condition is not checked  
//		System.out.println(a<b|++a == c);//true | true = true  
//		System.out.println("the value of a is: "+a);//11 because second condition is checked 
//	 
//	}
//}
        //Scenario for Operators End..	


        // Scenario for for loop Start.	
//class Sample{
//	public static void main(String[] args) {
//		 aa:
//			 for(int i =1; i<4; i++)
//			 {
//				 
//			    bb:
//				 for(int j=1; j<4; j++)
//					 
//				 {
//					 if(i==1){
//						 break bb;
//					 }
//					 System.out.println(i+" "+j); 
//				 }
//		 }  
//	}
//}
         //Scenario for for loop End...


//Scenario for Encapsulation start.
//	 class Student{  
//	private String name = "sethu";  
//	Student(String name){
//		this.name = name;
//		System.out.println("the name inside the constructor is: "+name);
//	}
// public String getName(){  
//	return name;  
//	}  
//	public void setName(String name){  
//		 
//	this.name=name; 
//	}  
//	String get(){
//		return name;
//	}
//	}  
//	 class Sample{
//		 public static void main(String[] args) {
//			Student s=new Student("setupathi");  
//			 s.setName("Vijaya"); 
//				System.out.print(s.getName()); 
//				s.setName("Bharathi");
//				System.out.println(s.getName()); 
//				 System.out.println(s.get());
//				  }
//		 }
     //Scenario for Encapsulation End.    

        //Scenario for String immutable Start.
//		class Sample{
//			 public static void main(String args[]){
//			   String s="Sachin";
//			System.out.println("the value first s hashcode"+System.identityHashCode(s));
//			String s1 ="Sachin";
//			System.out.println(System.identityHashCode(s1));
//			String s2 ="Sachin";
//			System.out.println(System.identityHashCode(s2));
//			String s3 ="Sachin";
//			System.out.println(System.identityHashCode(s3));
//			String s4 ="Sachin";
//			System.out.println(System.identityHashCode(s4));
//			String s5 ="Sachin";
//			System.out.println(System.identityHashCode(s5));
//			   s=s.concat(" Tendulkar");
//			System.out.println("the value of new hashcode"+System.identityHashCode(s3));
//			   System.out.println(s); 
//			System.out.println(s1);
//			System.out.println(System.identityHashCode(s1));
//			System.out.println(s2);
//			System.out.println(System.identityHashCode(s2));
//			System.out.println(s3);
//			System.out.println(System.identityHashCode(s3));
//			System.out.println(s4);
//			System.out.println(System.identityHashCode(s4));
//			System.out.println(s5);
//			System.out.println(System.identityHashCode(s5));
//			 }
//		}
			  //Scenario for String immutable End.  
   

        //Scenario for String == method concept start.
//class Sample{
//	 
//	public static void main(String[] args) {
//		  String s2 =s1+"pathi"; //concat is a runtime method, so s2 object will store in heap memory.
//		 String s3="sethupathi";
//		 System.out.println(s2 == s3); //
//		 System.out.println(s2.equals(s3)); //
//				String s1 = new String("sethu");
//				String s2 = new String("sethu");
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(s1 == s2);
//		String s3 = "sethu";
//		String s4 = "sethu";
//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
//		System.out.println(s3 == s4);
		
	//}
//}
      //Scenario for String == method concept end.
		
	
	  