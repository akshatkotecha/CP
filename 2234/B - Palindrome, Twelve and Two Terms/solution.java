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
			if(n==10) System.out.println(-1);
			else if(n%12==10) System.out.println(22+" "+(n-22));
			else System.out.println(n%12+" "+(n-(n%12)));
		}
	}
}
 
 