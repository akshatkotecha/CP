import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       long x=sc.nextLong();
	       long y=sc.nextLong();
	       long total=0;
	       long a[]=new long[n];
	       for(int i =0;i<n;i++)
	       {
	           a[i]=sc.nextLong();
	           total+=a[i]/x;
	       }
	       long m=Long.MIN_VALUE;
	      // int cur=0;
	       for(int i=0;i<n;i++)
	       {
	          long cur=total-(a[i]/x);
	          long k=cur*y+a[i];
	          m=Math.max(m,k);
	        }
	       System.out.println(m);
	   }
 
	}
}