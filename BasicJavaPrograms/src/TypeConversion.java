
public class TypeConversion {
	
	public static void main(int args){
		System.out.println("Hiiii");
	}
	
	
public static void main(String args[]){
	Integer n=1;
	String n1="midhun";
 System.out.println(n.hashCode());
 System.out.println(System.identityHashCode(n));
 
 
 System.out.println(n1.hashCode());
 System.out.println(System.identityHashCode(n1));
 TypeConversion.main(1);
 
 
	// String object to primitive(int,long,float,double,short) conversion.
//		String s ="100";  // or String s = new String("10");
//		int a =  Integer.parseInt(s); // or int a =  Integer.valueOf(s);
//		System.out.println(a);
//		long a = Long.parseLong(s); // or long a = Long.valueOf(s);
//		System.out.println(a); 
//		 short a = Short.parseShort(s); // or short a = Short.valueOf(s);
//		System.out.println(a);
//		long a = Long.parseLong(s); // or Long a = Long.valueOf(s);
//		System.out.println(a);
//		 float a = Float.parseFloat(s); // or float a = Float.valueOf(s);
//		System.out.println(a);
//		double a = Double.parseDouble(s); // or double a = Double.valueOf(s); 
//		System.out.println(a);
			 
  // Convert primitive(int,long,float,double,short) to String object.	
		 
//		 int i =20; // convert primitive int to String object.	
//		 String s1 = String.valueOf(i); // or String s1 = Integer.toString(a);
//		 System.out.println(s1);
//		 long l =20; // convert primitive long to String object.
//		 String s2 = String.valueOf(l); // or String s2 = Long.toString(l);
//		 System.out.println(s2);
//		 float f =20; // convert primitive float to String object.
//		 String s3 = String.valueOf(f); // or String s3 =Float.toString(f);
//		 System.out.println(s3);
//		 double d =20; // convert primitive double to String object.
//		 String s4 = String.valueOf(d); // or String s4 = Double.toString(d);
//		 System.out.println(s4); 
//		 short r1=20;   // convert primitive short to String object.
//		 String s5 =String.valueOf(r1); // String s4 = Short.toString(d);
//		 System.out.println(s5);
		 
//Convert Wrapper(Integer,Short,Long,Flaot,Double) to String object 
//		 Integer I = new Integer(10);
//		 String $s1 = I.toString(); // Or String $s1= String.valueOf(I);
//		 System.out.println($s1);
//		 Short S = new Short((short) 10);
//		 String $s2 = S.toString(); // // Or String $s2= String.valueOf(S);
//		 System.out.println($s2); 
//		 Long L = new Long(100);
//		 String $s3 = L.toString(); // Or String $s3= String.valueOf(L);
//		 System.out.println($s3);
//		 Float F = new Float(20f); // Or Or String $s4= String.valueOf(F);
//		 String $s4= F.toString();
//		 System.out.println($s4); 
//		 Double D= new Double(50); // Or String $s5= String.valueOf(D);
//		 String $s5 = D.toString();
//		 System.out.println($s5);
		 
	// Convert String to Wrapper(Integer,Short,Long,Flaot,Double) 
//		 String value="50";
//		 Integer wrapInt = Integer.parseInt(value);
//		 Short  wrapShort = Short.parseShort(value);
//		 Long wrapLong = Long.parseLong(value);
//		 Float wrapFloat = Float.parseFloat(value);
//		 Double wrapDouble = Double.parseDouble(value);
//		 Byte wrapByte = Byte.parseByte(value);
		 
		 // Convert Wrapper(Integer,Short,Long,Flaot,Double)  to primitive (int,long,float,double,short)
//		 Integer I = new Integer(10);
//		 int i = I;
//		 System.out.println(i);
//		 Short S = new Short((short) 10);
//		 short sh=S;
//		 System.out.println(sh);
//		 Long L = new Long(100);
//		 long l=L;
//		 System.out.println(l);
//		 Float F = new Float(20f);
//		 float f= F;
//		 System.out.println(f);
//		 Double D= new Double(50); 
//		 double d=D;
//		 System.out.println(d);
		 
	// Convert primitive(int,long,float,double,short) to Wrapper(Integer,Short,Long,Flaot,Double) 
//		int i = 10;
//		Integer I =  i;
//		System.out.println(I);
//		short sh=20;
//		Short S = sh;
//		System.out.println(S);
//		long l=100;
//		Long L =  l;
//		System.out.println(L);
//		float f= 20f;
//		Float F = f;
//		System.out.println(F);
//		double d=50;
//		Double D= d;
//		System.out.println(D);
		 
		}
}
