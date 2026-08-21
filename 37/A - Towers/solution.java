import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a[]=new int[n];
	   HashSet<Integer> set = new HashSet<>();
	   for(int i=0;i<n;i++)
	   {
	       a[i]=sc.nextInt();
	       set.add(a[i]);
	   }
	   Arrays.sort(a);
	   int ans=0;
	   int prev=1;
	   for(int i=1;i<n;i++)
	   {
	       if(a[i]!=a[i-1])
	       {
	           ans=Math.max(ans,prev);
	           prev=1;
	       }
	       else prev++;
	   }
	   ans=Math.max(ans,prev);
	   System.out.println(ans +" "+ set.size());
 
	}
}