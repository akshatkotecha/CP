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
			String s=sc.next();
			int z=0;
			int a[]=new int[n];
			int k=0;
			for(int i=0;i<n;i++)
			{
			    if(s.charAt(i)=='1')
			    {
			        a[k++]=i+1;
			        z++;
			    }
			}
			System.out.println(z);
			for(int i=0;i<z;i++) System.out.print(a[i]+ " ");
			System.out.println();
			
			
		}
	}
}
 
 