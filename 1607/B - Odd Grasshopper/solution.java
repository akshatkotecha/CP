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
			long x=sc.nextLong();
			long y=sc.nextLong();
			long z=0;
			if(y%4==1) z=-y;
			else if(y%4==2) z=1;
			else if(y%4==3) z=y+1;
			else z=0;
			
			if(x%2==0) x=x+z;
			else x=x-z;
			System.out.println(x);
		}
	}
}
 
 