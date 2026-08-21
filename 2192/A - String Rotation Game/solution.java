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
	       int c=1;
	       boolean hasEqual=false;
           boolean ok=false;
	       for(int i=1;i<n;i++)
	       {
	           if(s.charAt(i)!=s.charAt(i-1)) c++;
	           else hasEqual=true;
	       }
	       if(hasEqual && s.charAt(0)!=s.charAt(n-1)) System.out.println(c+1);
	       else System.out.println(c);
	   }
	}
}