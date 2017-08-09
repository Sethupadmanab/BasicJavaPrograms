
 abstract class Phone{
 public abstract void showConfig();
	 }
 class SamsungPhone extends Phone
 {
	 public void showConfig()
	 {
		 System.out.println("samsung");
	 }
}
 
class IPhone extends Phone
 {
	 public void showConfig()
	 {
		 System.out.println("iphone");
	 }

	 
 }

class Windows extends Phone
 {
	 public void showConfig()
	 {
		 System.out.println("windows");
	 }
}
public class AbstractDemo {
	 static void show(Phone ob)
	{
		  ob.showConfig();  
	}
public static void main(String[] args) {
		SamsungPhone obj = new SamsungPhone();
		 IPhone obj1 = new  IPhone();
		 Windows obj2 = new  Windows();
		 show(obj);
		 show(obj1);
		 show(obj2);
		  
		 

	}

}
