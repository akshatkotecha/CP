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
			char a = sc.next().charAt(0);
 
			String s1 = sc.next();
 
			String s = s1 + s1;
 
			n = n * 2;
 
			long lastg = -1;
			long max = Integer.MIN_VALUE;
 
			for(int i = (int)n - 1; i >= 0; i--)
			{
			    if(s.charAt(i) == 'g')
			    {
			        lastg = i;
			    }
 
			    if(s.charAt(i) == a)
			    {
			        long diff = lastg - i;
 
			        max = Math.max(max, diff);
			    }
			}
 
			System.out.println(max);
		}
	}
}