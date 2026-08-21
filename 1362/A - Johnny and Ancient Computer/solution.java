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
		public static void swap(long a,long b)
		{
		    long temp=a;
		    a=b;
		    b=a;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			long a=x;
			long b=y;
			while(a%2==0) a/=2;
			while(b%2==0) b/=2;
			if(a!=b) {
			    System.out.println(-1);
			    continue;
			}
			if(x==y) {
			    System.out.println(0);
			    continue;
			}
			long ans=0;
			if(x<y) {
			    long temp=x;
			    x=y;
			    y=temp;
			}
			x/=y;
			while(x>=8) {
			    x/=8;
			    ans++;
			}
			if(x>1) ans++;
			System.out.println(ans);
			
			
			
		}
	}
}
 
 