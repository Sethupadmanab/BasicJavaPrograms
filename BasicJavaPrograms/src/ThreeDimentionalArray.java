
public class ThreeDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c[][][] = new int[1][4][4];
       for(int i=0; i<1; i++)
       {
    	   for(int j=0; j<4; j++)
    	   {
    		   for(int k=0; k<4; k++)
    		   {
    			   c[i][j][k] = i + j + k;
    		   }
    	   }
       }
       
      //to get the output bu using normal for loop 
//       for(int i=0; i<1; i++)
//       {
//    	   for(int j=0; j<4; j++)
//    	   {
//    		   for(int k=0; k<4; k++)
//    		   {
//    			    System.out.print(" "+ c[i][j][k]);
//    		   }
//    		   System.out.println();
//    	   }
//       }
       
       //to get the output bu using enhanced for loop 
       for(int i[][] : c)
       {
    	   for(int j[] : i)
    	   {
    		   for(int k : j)
    		   {
    			   System.out.print(" "+ k);
    		   }
    		   System.out.println();
    	   }
       }
       
	}

}
