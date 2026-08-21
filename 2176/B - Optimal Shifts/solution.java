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
	       n*=2;
	       s+=s;
	       int ans=0,cur=0;
	       for(int i=0;i<n;i++)
	       {
	           if(s.charAt(i)=='1')  cur=0;
	           else cur++;
	           ans=Math.max(ans,cur);
	       }
	       System.out.println(ans);
	   }
	}
}