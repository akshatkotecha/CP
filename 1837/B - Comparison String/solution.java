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
			String s=sc.next();
			int c=1;
			int max=1;
			for(int i=0;i<n-1;i++)
			{
			    if(s.charAt(i)==s.charAt(i+1)) c++;
			    else {
			        max=Math.max(max,c);
			        c=1;
			    }
			}
			System.out.println(Math.max(max,c)+1);
		}
	}
}
 
 