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
		//	int a[]=new int[n];
		//	for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    if(n%2==1 || n<4) System.out.println(-1);
		    else System.out.println(((n+5)/6)+" "+(n/4));
		}
	}
}
 
 