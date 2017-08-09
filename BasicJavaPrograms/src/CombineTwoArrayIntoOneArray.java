import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArrayIntoOneArray {
	public static int[]merge(int[]c, int[]d){
		  int[]e = new int[c.length+d.length];
		  int i;
		  
		for(i=0; i<c.length; i++)
		     e[i] = c[i];

		     for(int j=0; j<d.length; j++)
		        e[i++]=d[j];
		        return e;
		}

	public static void main(String[] args) {
		 int[]a = {1,2,3,4};
		 int[]b = {4,16,1,2,3,22};
		  int e[] =merge(a,b); 
		 Arrays.sort(e);
		 for(int s : e)
		 {
			 System.out.println("the value of e is "+ s);
		 }
		 int[]c = new int[a.length+b.length];
		 int count=0;

		  for(int i=0; i<a.length; i++)
		    {
		       c[i]=a[i];
		       count++;
		    }

		 for(int j=0;j<b.length;j++)
		    {
		       c[count++]=b[j];
		    }
		 Arrays.sort(c);
		        for(int i=0;i<c.length;i++)
		        System.out.print(c[i]+" ");
		        
	//Another way to merge two array into one array
		        String arr1[] = { "A", "E", "I" };
			      String arr2[] = { "O", "U" };
			      List<String> list = new ArrayList(Arrays.asList(a));
			      list.addAll(Arrays.asList(arr2));
			     String[] s =  list.toArray(new String[list.size()]);
			      //String s=Arrays.toString(c);
			 
			      for(String s1: s){
			     System.out.println(s1);
			      }

	}

}
