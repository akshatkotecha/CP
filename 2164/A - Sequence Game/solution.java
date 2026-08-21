import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       int b=sc.nextInt();
	       Arrays.sort(a);
	       if(b< a[0] || b>a[n-1])
	       {
	           System.out.println("NO");
	       }
	       else
	       {
	           System.out.println("YES");
	       }
	   }
 
	}
}