
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][] = {
    		      {4,5,6,8},
    		      {5,9,0,2},
    		      {2,5,7,3}
    		     };
//     for(int i=0; i<4; i++)
//     {
//    	 for(int j=0; j<4; j++)
//    	 {
//    		System.out.print(a[i][j]+" "); 
//    	 }
//    	 System.out.println();
//    	 }
     
     for(int x[] : a )
     {
    	 for(int y : x)
    	 {
    		 System.out.print(y+" ");
    	 }
    	 System.out.println();
     }
     }
     
     }
     
	


