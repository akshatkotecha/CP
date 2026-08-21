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
		public static long ceil(long a,long b){
		    return (a+b-1)/b;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			long a=1;
			long b=n-1;
			for(long i=2;i*i<=n;i++){
			    if(n%i==0){
			        a=n/i;
			        b=n-a;
			        break;
			    }
			}
			System.out.println(a+" "+b);
		}
	}
}
 
 