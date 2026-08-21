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
			Arrays.sort(a);
			int l=0;
			int r=n-1;
            if(a[l]%2==a[r]%2) {System.out.println(0);continue;}
            int ans1=0,ans2=0;
            for(int i=0;i<n;i++)
            {
                if(a[n-1]%2==a[i]%2)
                {
                   // ans1=i+1;
                    break;
                }
                else ans1++;
            }
            for(int i=n-1;i>=0;i--)
            {
                if(a[0]%2==a[i]%2)
                {
                    break;
                }
                else ans2++;
            }
            System.out.println(Math.min(ans1,ans2));
		}
	}
}
 
 
 