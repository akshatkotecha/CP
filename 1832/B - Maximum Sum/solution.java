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
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			long b[]=new long[n];
			Arrays.sort(a);
			b[0]=a[0];
			for(int i=1;i<n;i++) b[i]=b[i-1]+a[i];
			long max=Long.MIN_VALUE;
			for(int i=0;i<=k;i++)
			{
			    int second=k-i;
			    int left=2*i;
			    int right=n-second-1;
			   // if(i==0) left=1;
			    long sum=b[right]-(left==0 ? 0: b[left-1]);
			    max=Math.max(sum,max);
			}
			System.out.println(max);
		}
	}
}
 
 