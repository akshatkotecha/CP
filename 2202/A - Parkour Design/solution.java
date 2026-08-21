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
	       int x=sc.nextInt();
           int y=sc.nextInt();
           int k=x-2*y;
           if(k%3==0 && k>=0 &&  x>=-4*y) System.out.println("YES");
           else System.out.println("NO");
	   }
 
	}
}