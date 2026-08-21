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
	       if(n==1)  System.out.println("1");
	       else if(n==2)  System.out.println("9");
	       else
	       {
	           int z=n*n;
	           int y=3*z-3;
	           int x=z-1-n;
	           int f=y+x;
	           int k=5*x;
	           int q=Math.max(f,k);
	           System.out.println(q); 
	       }
	   }
 
	}
}