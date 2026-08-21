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
			int m=sc.nextInt();
			int b[]=new int[m];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        for(int i=0;i<m;i++) b[i]=sc.nextInt();
	        Arrays.sort(a);
	        Arrays.sort(b);
	        if(n<2*m){
	            System.out.println("NO");
	            continue;
	        }
	        boolean ok=true;
	        for(int i=0;i<m;i++){
	            if(a[i]>b[i]) ok=false;
	        }
	        int k=m-1;
	        for(int j=n-1;j>=m && k>=0;j--){
	            if(a[j]<b[k]) ok=false;
	            k--;
	        }
	        if(ok) System.out.println("YES");
	        else System.out.println("NO");
		}
	}
}
 
 