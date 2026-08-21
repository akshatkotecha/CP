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
			int q=sc.nextInt();
			long a[]=new long[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextLong();
	        long sum=0;
	        long pre[]=new long[n+1];
	        for(int i=1;i<=n;i++) pre[(int)i]=pre[(int)i-1]+a[(int)i-1];
	        for(long num : a) sum+=num;
	        while(q-->0){
	            long l=sc.nextLong();
	            long r=sc.nextLong();
	            long k=sc.nextLong();
	            long sum1=pre[(int)r]-pre[(int)l-1];
	            long sum2=(r-l+1)*k;
	            long sum3=sum-sum1+sum2;
	            if(sum3%2==0) System.out.println("NO");
	            else System.out.println("YES");
	            
	        }
		}
	}
}
 
 