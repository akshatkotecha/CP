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
			int count2=0;
			int count3=0;
			while(n>0 && n%3==0) 
			{
			    count3++;
			    n/=3;
			}
			while(n>0 && n%2==0) 
			{
			    count2++;
			    n/=2;
			}
			if(n>1 || count2>count3)    System.out.println(-1);
			else System.out.println(count3 +(count3-count2));
		}
	}
}
 
 