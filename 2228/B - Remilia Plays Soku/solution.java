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
			int x=sc.nextInt();
			int y=sc.nextInt();
			int k=sc.nextInt();
			if(n<=3) System.out.println(1);
			else{
			int ans=Math.min(Math.abs(x-y),n-Math.abs(x-y))+k;
			System.out.println(ans);
			}
		}
	}
}
 
 