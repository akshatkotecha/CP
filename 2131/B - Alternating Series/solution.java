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
			for(int i=1;i<=n;i++)
			{
			    if(i%2==1) System.out.print(-1 +" ");
			    else if(i==n && n%2==0) System.out.print((2) +" ");
			    else System.out.print(3+" ");
			}
			System.out.println();
		}
	}
}
 
 
 