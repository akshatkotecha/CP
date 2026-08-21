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
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
			long n = sc.nextLong();
			long x = sc.nextLong();
 
			long a[] = new long[(int)n];
 
			long min = 0;
			long max = 0;
 
			for(int i = 0; i < n; i++)
			{
				a[i] = sc.nextLong();
 
				max += (a[i] + x - 1) / x;
 
				min += a[i];
			}
 
			min = (min + x - 1) / x;
 
			System.out.println(min + " " + max);
		}
	}
}