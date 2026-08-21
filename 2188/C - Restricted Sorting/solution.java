import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-- > 0)
	   {
	       int n = sc.nextInt();
	       int a[] = new int[n];
	       int b[] = new int[n];
	       
	       for(int i = 0; i < n; i++) 
	       {
	           a[i] = sc.nextInt();
	           b[i] = a[i];
	       }        
	       
	       Arrays.sort(b);
	       
	       if(Arrays.equals(a, b)) 
	       {
	           System.out.println(-1);
	           continue;
	       }
	       
	       int ans = Integer.MAX_VALUE;
	       
	       for(int i = 0; i < n; i++)
	       {
	           if(a[i] != b[i])
	               ans = Math.min(ans, Math.max(a[i]-b[0],b[n-1]-a[i]));
	       }
	       
	       System.out.println(ans);
	   }
	}
}