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
			int b[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        for(int i=0;i<n;i++) b[i]=sc.nextInt();
	        boolean ok=true;
	        int c1=0;
	        for(int i=0;i<n;i++){
	            if(a[i]<b[i])  ok=false;
	            c1+=a[i]-b[i];
	        }
	        if(!ok){
	            Arrays.sort(a);
	            Arrays.sort(b);
	        }
	        int c2=0;
	        boolean ok1=true;
	        for(int i=0;i<n;i++){
	            if(a[i]<b[i]) {
	                ok1=false;
	                break;
	            }
	            c2+=a[i]-b[i];
	        }
	        if(ok) System.out.println(c1);
	        else if(!ok && ok1) System.out.println(c+c2);
	        else System.out.println(-1);
	        
	        
		}
	}
}
 
 