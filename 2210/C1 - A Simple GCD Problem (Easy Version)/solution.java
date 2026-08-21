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
    	   return (a / gcd(a, b)) * b;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int b[]=new int[n];
			for(int i=0;i<n;i++) b[i]=sc.nextInt();
			int c=0;
			for(int i=1;i<n-1;i++)
			{
			    if(lcm(gcd(a[i],a[i-1]),gcd(a[i],a[i+1]))!=a[i]) c++;
			}
			if(gcd(a[0],a[1])!=a[0]) c++;
			if(gcd(a[n-2],a[n-1])!=a[n-1]) c++;
			System.out.println(c);
		}
	}
}
 
 
 