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
			int k=sc.nextInt();
			int a[]=new int[26];
			String s=sc.next();
			for(int i=0;i<n;i++)
			{
			    char b=s.charAt(i);
			    a[b-'a']++;
			}
			int c=0;
			for(int i=0;i<26;i++)
			{
			    if(a[i]%2==1) c++;
			}
			if(c>k+1) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
 
 