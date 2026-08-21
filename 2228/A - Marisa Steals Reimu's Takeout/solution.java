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
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int c=0;
			int d=0;
			int e=0;
			for(int i=0;i<n;i++) 
			{
			    if(a[i]==0) c++;
			    else if(a[i]==1) d++;
			    else e++;
			}
			int q=Math.min(d,e);
			d-=q;
			e-=q;
			int sum=c+q+d/3+e/3;
			System.out.println(sum);
		}
	}
}
 
 