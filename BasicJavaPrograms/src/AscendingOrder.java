import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Details
{
	Long number;
	Details(long number)
	{
		this.number = number;
	}
	public String toString(){
		return " "+number;
	}
}
public class AscendingOrder {

	public static void main(String[] args) {
		
		 List<Details> al= new ArrayList<Details>();
		   Details d=new Details(8056);
		   Details d1=new Details(8056);
		   al.add(d);
		   al.add(d1);
		   Collections.sort(al, new MyComparator());
		   System.out.println(al);
		   
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Details d=(Details)obj1;
		Details d1=(Details)obj2;
		return d1.number.compareTo(d.number);
//		if(d.number == d1.number){
//			return 0;
//		}else if(d.number > d1.number)
//		{
//			return 1;
//		}
//		else{
//			return -1;
//		}
 
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n, temp;
		
//		String input = "Helo World";
//        char[] temparray = input.toCharArray();
//        int left, right=0;
//        right = temparray.length-1;
// 
//        for (left=0; left < right ; left++ ,right--)
//        {
//            // Swap values of left and right
//            char temp = temparray[left];
//            temparray[left] = temparray[right];
//            temparray[right]=temp;
//        }
// 
//        for (char c : temparray)
//            System.out.print(c);
//        System.out.println();
		 
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter no. of elements you want in array:");
//        n = s.nextInt();
//        int a[] = new int[n]; 
//        System.out.println("Enter all the elements:");
//        for (int i = 0; i < n; i++) 
//        {
//            a[i] = s.nextInt();
//        }
        
// we can sort the array by using util classes of Arrays. so by default it will sort the inputs whereas number sort by ascending to desending and string 
 // can sort by alphabetical order.      
//       Arrays.sort(a);
//      for(int i: a)
//      {
//    	  System.out.println(i);
//      }
        
       // The below one is manully do the sorting process by our own,
//        for (int i = 0; i < n; i++) 
//        {
//            for (int j = i + 1; j < n; j++) 
//            {
//                if (a[i] > a[j]) // For Descending order just change if (a[i] < a[j]) 
//                {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.print("Ascending Order:");
//        for (int i = 0; i < n - 1; i++) 
//        {
//            System.out.print(a[i] + ",");
//        }
//        System.out.print(a[n - 1]);

//	}
//}

