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
		   int l=0;
		   int r=n-1;
		   while(l<r)
		   {
		       if(s.charAt(l)==s.charAt(r)) break;
		       else {
		           l++;
		           r--;
		       }
		   }
		   System.out.println(Math.max(0,r-l+1));
		}
	}
}