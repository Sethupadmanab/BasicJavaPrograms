
public class MultipleCatchProgram {
	
	
	public static void main(String[] args) {
		 try{
			// int arithmetic = 50/0;
			 int index[] = new int[4];
			 index[24] = 78;
			 
		 }catch(ArithmeticException e)
		 {
			System.out.println("divided by zero " + e.getMessage()); 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("out of bound exception" + e); 
		 }
		finally
		 {
			System.out.println("I am always Executed"); 
		 }
  
	}

}
