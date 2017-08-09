
abstract class ADemo{
	 void show(){
		 System.out.println("success");
	 }
 }
 interface CDemo{
	 void showName();
 }
  
 class BDemo extends ADemo implements CDemo{
	public void show()
	 {
		 System.out.println("B");
	 }
	public void showName()
	 {
		 System.out.println("C");
	 }
 }
public class InterfaceDemo1 {
	 public static void main(String args[]) {
		 CDemo obj = new BDemo();
		 ((ADemo) obj).show();
		 obj.showName();
//		 String a ="sethu";
//		 String b="sethu";
//		 String c="sethu";
//		 System.out.println("value of original a "+a+" "+b+" "+c );
//		 b="pathi";
//		 
//		 System.out.println("value of original a "+a+" "+b+" "+c );
//		 
	 }

}
