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
	       int k=sc.nextInt();
	       String s=sc.next();
	       int sum=0;
	       int b=-1;
	       for(int i=0;i<n;i++)
	       {
	           if(s.charAt(i)=='1') b=i+k;
	           else {
	               if(i>b) sum++;
	           }
	       }
	       System.out.println(sum);
	   }
 
	}
}
 