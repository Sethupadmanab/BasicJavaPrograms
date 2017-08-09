import java.util.Arrays;

public class EnhanedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[] = new int[4];
    
   for(int i=0; i<a.length; i++)
   {
	   a[i] = 0+6; // 6 7 8 9
	   System.out.println(a[i]);
   }
   Arrays.toString(a);
   //String value = a.toString();
   System.out.println(a);
//   for(int i =0; i<a.length; i++)
//   {
//	   System.out.println(a[i]);
//   }
   
  for(int x : a)
  {
	   System.out.println(x);
   }
	}

}
