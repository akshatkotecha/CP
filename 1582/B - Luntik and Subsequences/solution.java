import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static boolean check(int x)
    {
        int c1=0;
        int c2=0;
        while(x>0)
        {
            if(x%10==0) c1++;
            c2++;
            x/=10;
        }
        return c2-1==c1;
    }
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
			int o=0,z=0;
			for(int i=0;i<n;i++)
			{
			    if(a[i]==0) z++;
			    if(a[i]==1) o++;
			}
			long k=(long)Math.pow(2,z);
			System.out.println(k*o);
			
		}
	}
}
 
 