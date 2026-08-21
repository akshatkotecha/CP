import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
	public static long lcm(long a, long b) {
    	return (a * b) / gcd(a, b);
	}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
			int n = sc.nextInt();
 
			long a[] = new long[n];
 
			for(int i = 0; i < n; i++) a[i] = sc.nextLong();
 
			for(int i = n - 1; i >= 1; i--)
			{
			    if(a[i] > 0) a[i - 1] += a[i];
			}
 
			int ans = 0;
 
			for(int i = 0; i < n; i++)
			{
			    if(a[i] > 0) ans++;
			}
 
			System.out.println(ans);
		}
	}
}