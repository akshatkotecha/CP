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
	       int a[]=new int[n];
	       int low=1;
	       int high=n;
	       for(int i=0;i<n;i++) 
	       {
	           if(i%2==0) a[i]=low++;
	           else a[i]=high--;
	       }
	  //     for(int i=1;i<q;i+=2) a[i]=i;
	       for(int i=n-1;i>=0;i--) 
	       {
	           System.out.print(a[i] +" ");
	       }
	       System.out.println();
	   }
 
	}
}