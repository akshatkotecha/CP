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
	       int q=n*(n-1);
	       int b[]=new int[q/2];
	       for(int i=0;i<b.length;i++)  b[i]=sc.nextInt();
	       int a[]=new int[n];
	       Arrays.sort(b);
	       int idx=0;
	       for(int i=n-1;i>=1;i--)
	       {
	           System.out.print(b[idx]+" ");
	           idx+=i;
	       }
	       System.out.println(1000000000);
	   }
 
	}
}