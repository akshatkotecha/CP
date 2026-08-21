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
		public static boolean isFair(long n)
		{
		    long num=n;
		    while(n>0)
		    {
		        long k=n%10;
		        if(k!=0 && num%k!=0) return false;
		        n/=10;
		    }
		    return true;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			while(!isFair(n)) n++;
			System.out.println(n);
		}
	}
}
 
 