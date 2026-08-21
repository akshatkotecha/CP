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
    		return (a + b) / gcd(a, b);
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
			int b[]=new int[101];
			for(int i=0;i<n;i++) b[a[i]]++;
		//	Arrays.sort(a);
	//		int j=0;
	//		while(a[j]!=0) j++;
			int c[]=new int[101];
			int max=-1;
			for(int i=1;i<=100;i++)
			{
			    for(int j=1;j<b.length;j++)
			    {
			        if(b[j]>=i) c[i]++;
			        max=Math.max(max,c[i]*i);
			    }
			}
			System.out.println(max);
		}
	}
}
 
 