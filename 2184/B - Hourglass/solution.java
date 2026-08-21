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
	       long s=sc.nextLong();
	       long k=sc.nextLong();
	       long m=sc.nextLong();
	       long top;
	       long n=m/k;
	       long r=m%k;
	       if(n==0) System.out.println(Math.max(0,s-m));
	       else if(k>=s) System.out.println(Math.max(0,s-r));
	       else{
	           if(n%2==0)  top=s;
	           else top=k;
	           
	           System.out.println(Math.max(0,top-r));
	       }
	       
	      // System.out.println();
	   }
 
	}
}