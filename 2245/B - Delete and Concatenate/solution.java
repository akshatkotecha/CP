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
			int c=sc.nextInt();
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        long sum=0;
	        Arrays.sort(a);
	        int l=0;
	        int r=n-1;
	        while(a[l]<=c && l<r){
	            sum+=(a[r]-c);
	            l++;
	            r--;
	        }
	        for(int i=l;i<=r;i++) sum+=(a[i]-c);
	        System.out.println(sum);
	        
	    }
 
	}
}
 
 