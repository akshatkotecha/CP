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
	       //int n=sc.nextInt();
	       String s=sc.next();
	       int n=s.length();
	       int o=0,z=0;
	       for(int i=0;i<n;i++)
	       {
	           if(s.charAt(i)=='1') o++;
	           else z++;
	       }
	       int k=0;
	       for(int i=0;i<n;i++)
	       {
	           if(s.charAt(i)=='0'&& o>0)
	           {
	                  o--; 
	                  k++;
	           }
	           else if(s.charAt(i)=='1'&& z>0){
	                   z--;
	                   k++;
	           }
	           else{
	               break;
	           }
	       }
	       System.out.println(n-k);
	   }
 
	}
}