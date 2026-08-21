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
		private static int xor(int n)
		{
		    int a=n%4;
		    if(a==0) return n;
		    else if(a==1) return 1;
		    else if(a==2) return n+1;
		    else return 0;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=xor(a-1);
			if(c==b) System.out.println(a);
			else if((c^b)!=a) System.out.println(a+1);
			else System.out.println(a+2);
			
			
		}
	}
}
 
 