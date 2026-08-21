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
		//	int n=sc.nextInt();
		//	int a[]=new int[n];
		//	for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    String s=sc.next();
		    int n=s.length();
		    int o=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='0') o++;
		    }
		    int min=Math.min(o,n-o);
		    if(min%2==1) System.out.println("DA");
		    else System.out.println("NET");
		}
	}
}
 
 