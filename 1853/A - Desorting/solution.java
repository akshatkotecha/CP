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
		    boolean ok=true;
		    for(int i=1;i<n;i++){
		        if(a[i]<a[i-1]) ok=false; 
		    }
		    int d=Integer.MAX_VALUE;
		    for(int i=1;i<n;i++){
		        d=Math.min(d,a[i]-a[i-1]);
		    } 
		    if(ok) System.out.println((d/2)+1);
		    else System.out.println(0);
		    
		    
		}
	}
}
 
 