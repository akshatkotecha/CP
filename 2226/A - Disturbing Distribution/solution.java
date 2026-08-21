import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    static long mod=676767677;
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
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
			{
			    if(a[i]>1) sum+=a[i];
			}
			if(a[n-1]==1) sum++;
			System.out.println(sum);
		}
	}
}
 
 