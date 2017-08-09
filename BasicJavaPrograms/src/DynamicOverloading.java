
public class DynamicOverloading {

	public static void main(String[] args) {
		// A obj = new A();
		 A obj1 = new A();
		// obj.show();
		 obj1.show();

	}

}
 class A{
	void show(){
		System.out.println("in show A");
	}   
}
 class B{
	void show(){
		System.out.println("in show B");
	}
}

