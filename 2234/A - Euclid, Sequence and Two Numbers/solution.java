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
			boolean ok=true;
		    for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    Arrays.sort(a);
		    if(n==2){
		        System.out.println(a[1]+" "+a[0]);
		        continue;
		    }
		    else{
		        for(int i=n-1;i>=2;i--){
		            if(a[i]%a[i-1]!=a[i-2]){
		                System.out.println(-1);
		                ok=false;
		                break;
		            } 
		        }
		       if(ok) System.out.println(a[n-1]+" "+a[n-2]);
		    }
		}
	}
}
 
 