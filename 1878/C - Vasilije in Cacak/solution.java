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
			long n=sc.nextLong();
			long k=sc.nextLong();
			long x=sc.nextLong();
			long sum1=k*(k+1)/2;
			long sum2=n*(n+1)/2-(n-k)*(n-k+1)/2;
			if(x>=sum1 && x<=sum2) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
 
 