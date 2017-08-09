import java.util.Scanner;

public class MoveNextElementOfString {

	public static void main(String[] args) {
		System.out.println("enter the text: ");
	       Scanner cti = new Scanner(System.in);     
	       String a = cti.nextLine();
	        System.out.println("enter number of positions= ");
	        int b = cti.nextInt();
	       String firstPart = a.substring(1,b);  // line 1 // ethu
	       b--;
	       a = a.substring(b);  // seth
	       String m = a + firstPart ;             // line 2 //  upathiethu
	        System.out.println("now it is "+ m); // 

	}

}
