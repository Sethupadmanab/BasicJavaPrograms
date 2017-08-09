import java.io.Console;

public class DoWhile {    
	 static String x;
	   public static void main(String args[]) {
		  // String a = new String("sethu");
//		   String  b = new String("sethu");
//		  // String  a = new String("sethu1");
//	   System.out.println(System.identityHashCode(b));
//		  String a ="sethu";
//		  System.out.println(System.identityHashCode(a));
//		 // String b = "sethu";
//		  if(a==b ){
//			  System.out.println("working");
//		  }
//		  else{
//			  System.out.println("not working");
//		  }
		 //a.concat("pathi");
		   //System.out.println("The value of a is: "+a);
//	      char a ='a'; 
//	      char b = 'b';
//	      System.out.println(a+b);
//		   StringBuffer a = new StringBuffer("sethu");
//		   System.out.println(System.identityHashCode(a));
//		  // String a ="sethu";
//		   //a="pathi";
//		  // a.concat("pathi");  
//		  a= a.append("pathi"); // because string is immutable.
//		   System.out.println(System.identityHashCode(a));
//		   int s =3;
//		   s=4; // it is mutable.
//		   System.out.println(s);
//		   System.out.println(a);

	      do {
	          x="sethu";
	         System.out.print("value of x : " + x );  
	         x="sethupa";
	         System.out.print("\n");
	         System.out.print("value of x : " + x );
	        }while( x.equals("sethupa") ); 
	   }
	}