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
	       String s=sc.next();
	       int z=0;
	       for(int i = 0; i < n; i++)
	       {
	           if(s.charAt(i) == '0') z++;
	       }
	       int ones=n-z;
	       if(z==n)
	       {
	           System.out.println(0);
	           continue;
	       }
	       if(ones%2==0)
	       {
	           System.out.println(ones);
	           for(int i=0;i<n;i++)
	           {
	               if(s.charAt(i) == '1')  System.out.print((i+1) + " ");
	               System.out.println();
	           }
	       }
	       else if(z%2== 1)
	      {
	           System.out.println(z);
	           for(int i=0;i<n;i++)
	           {
	               if(s.charAt(i) == '0')  System.out.print((i+1) + " ");
	               System.out.println();
	           }
	       }
	       else
	       {
	           System.out.println(-1);
	       }
	   }
	}
}