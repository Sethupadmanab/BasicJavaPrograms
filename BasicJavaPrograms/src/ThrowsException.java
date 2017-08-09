
public class ThrowsException {
	static void nullPointer() throws NullPointerException
	{
		throw new NullPointerException("Null pointer");
	}
	static void arithmetic() throws ArithmeticException
	{
		throw new ArithmeticException("Arithmetic");
	}

	public static void main(String[] args) {
		nullPointer();
		 try{
			  
			 //nullPointer();
			 //arithmetic();
		 }catch(NullPointerException e)
		 {
			 System.out.println("The exception name is " + e);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("The exception name is " + e);
		 }
		 System.out.println("working");
     }

   }
