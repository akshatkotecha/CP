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
		    for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    Arrays.sort(a);
		    int m=0,s=0;
		    int mid=a[n/2];
		    for(int i=0;i<=n/2;i++)
		    {
		        if(a[i]!=mid) m++;
		    }
		    for(int i=n/2;i<n;i++) 
		    {
		        if(a[i]!=mid) s++;
		    }
		    System.out.println(Math.max(s,m));
		}
	}
}
 
 