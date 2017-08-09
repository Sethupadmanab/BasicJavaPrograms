interface Checking{
	public void getName();
	
}
public  class InterfaceDemo implements Checking{
	 
	public void getName(){
		System.out.println("working");
	}
public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.getName();
		}
}
