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
	       int n = sc.nextInt();
	       int y = sc.nextInt();
	       int r = sc.nextInt();
	       
	       int suspended = r + (y / 2);
	       System.out.println(Math.min(n, suspended));
	   }
	}
}