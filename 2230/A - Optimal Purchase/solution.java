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
		//	int a[]=new int[n];
		//	for(int i=0;i<n;i++) a[i]=sc.nextInt();\
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		    long k=n%3;
		    long j=n/3;
		    long min1=Math.min(j*b+k*a,j*b+b);
		    long min=Math.min(n*a,Math.min(min1,n*b));
		    System.out.println(min);
		}
	}
}
 
 