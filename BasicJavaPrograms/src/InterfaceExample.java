
interface A1{	 
//	 static int draw(){
//		 return 1;
//	 }
//	default void show(){     //satic method and default method available from java 1.8 version
//		
//	}
	 int data(int b);
 }
 interface A2
 {
	 int get();
 }
 interface A3{
	 String name(String name);
 }
 interface B3 extends A1,A2,A3
 {
	 void print();
 }
 class InterfaceExample implements B3{
	 public int data(int b) {
		 
			return b;
		}
	 
		public int get() {
			 
			return 7;
		}
 public String name(String name) {
			 
			return name;
 } 
 public void print() {
		System.out.println("working");
		
	}
 public static void main(String[] args) {
	InterfaceExample obj = new InterfaceExample();
	System.out.println(obj.data(5));
	System.out.println(obj.get());
	System.out.println(obj.name("sethu"));
	 obj.print();
	}
}
