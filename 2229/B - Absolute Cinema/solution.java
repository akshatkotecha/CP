import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static int gcd(int a, int b) {
        	if (b == 0) return a;
        	return gcd(b, a % b);
    		}
	public static int lcm(int a, int b) {
    		return (a * b) / gcd(a, b);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			for(int i=0;i<n;i++) b[i]=sc.nextInt();
		    long sum=0;
		    int max=0;
		    for(int i=0;i<n;i++)
		    {
		        sum+=Math.max(a[i],b[i]);
		        max=Math.max(max,Math.min(a[i],b[i]));
		    }
		    System.out.println(sum+max);
		}
	}
}
 
 