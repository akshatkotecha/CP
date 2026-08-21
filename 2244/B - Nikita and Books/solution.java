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
	        long prev=0;
	        long carry=0;
	        boolean ok=true;
	        for(int i=0;i<n-1;i++){
	            long avail=a[i]+carry;
	            long need=prev+1;
	            if(avail<need){
	                ok=false;
	                break;
	            }
	            carry=avail-need;
	            prev=need;
	            
	        }
	        if(ok){
	            long last=a[n-1]+carry;
	            if(last<=prev) ok=false;
	        }
	        if(ok) System.out.println("YES");
	        else System.out.println("NO");
	        
		}
	}
}
 
 