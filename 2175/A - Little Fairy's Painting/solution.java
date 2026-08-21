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
	       int a[]=new int[n];
	       Set<Integer> set = new HashSet<>();
	       for(int i=0;i<n;i++)  
	       {
	           a[i]=sc.nextInt();
	           set.add(a[i]);
	       }
	       Arrays.sort(a);
	       int s=set.size();
	       int ans=s;
	       for(int i=0;i<n;i++)
	       {
	           if(a[i]>=s)  
	           {
	               ans=a[i];
	               break;
	           }
	       }
	       
	       System.out.println(ans);
	   }
 
	}
}