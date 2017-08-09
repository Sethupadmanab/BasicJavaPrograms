import java.util.Arrays;

public class MissingNumberUsingArray {
	
//	public void missingnos(int a[],int b[])
//	{
//	    for(int i=0;i<a.length;i++)
//	    {
//	        for(int j=i+1;j<a.length;j++)
//	        {
//	            if(a[i]>a[j])
//	            {
//	                int c=a[i];
//	                a[i]=a[j];
//	                a[j]=c;
//	            }
//	        }
//	         
//	        System.out.print(a[i]);
//	    }
//	    for(int i=0;i<b.length;i++)
//	    {
//	        for(int j=i+1;j<b.length;j++)
//	        {
//	            if(b[i]>b[j])
//	            {
//	                int c=b[i];
//	                b[i]=b[j];
//	                b[j]=c;
//	            }
//	        }
//	        System.out.print(b[i]);
//	    }
//	    int d[]=new int[a.length];
//	    d=b;
//	    int missing=0;
//	    for(int i=0;i<b.length;i++)
//	    {
//	        if(a[i]!=d[i])
//	        {
//	            missing=a[i];
//	            break;
//	        }
//	    }
//	    System.out.println();
//	    System.out.print(missing);
//	}
//
	public static void main(String[] args) {
		 
		 int a[]={1,2,3,4,10};
		    int b[]={1,2,3,4};
		     
		    int d[]=new int[a.length];  
		    System.out.println(d.length);
		        d=b;   
		    System.out.println(d.length);
		   
		    

		    for(int ch: d)
		    System.out.println(ch);
		    int missing=0;
		    
		    for(int i=0;i<a.length;i++)
		    {
		        if(i>=b.length || a[i]!=d[i])
		        {
		            missing=a[i];
		             
		            break;
		        }
		    }
		    System.out.println("The missing number is: "+missing);
		    }
	 
	 
	}
