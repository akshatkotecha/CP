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
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        int max=0;
	        for(int i=1;i<n;i++){
	            if(a[i]<a[i-1]) max=Math.max(max,a[i-1]-a[i]);
	        }
	        for(int i=1;i<n;i++){
	            if(a[i]<a[i-1]) a[i]+=max;
	        }
	        boolean ok=true;
	        for(int i=1;i<n;i++){
	            if(a[i]<a[i-1]) ok=false;
	        }
	        if(ok) System.out.println("YES");
	        else System.out.println("NO");
		}
	}
}
 
 