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
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(y<b) {
			    System.out.println(-1);
			    continue;
			}
			int ans=y-b;
			a+=y-b;
			if(x>a) 
			{
			    System.out.println(-1);
			    continue;
			}
			System.out.println(ans+a-x);
		}
	}
}
 
 