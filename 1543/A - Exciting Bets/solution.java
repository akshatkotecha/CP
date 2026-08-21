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
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a>b)
		    {
		        long temp=a;
		        a=b;
		        b=temp;
		    }
			if(b==a) 
		    {
		        System.out.println(0+" "+0);
		        continue;
		    }
			else{
		    
		    long h=b-a;
		    long moves=Math.min(b%h,h-(b%h));
		    System.out.println(h+" "+moves);
			}
			
		}
	}
}
 
 