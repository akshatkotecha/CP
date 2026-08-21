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
		//	int a[]=new int[3*n+1];
			int l = 1;
int r = 3*n;
 
int[] a = new int[3*n];
int idx = 0;
 
while(l < r) {
    a[idx++] = l++;
    a[idx++] = r-1;
    a[idx++] = r;
    r -= 2;
}
			for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}
 
 