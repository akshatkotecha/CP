import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	//long msb = (long) (Math.log(n) / Math.log(2));
	public static long gcd(long a, long b) {
        	if (b == 0) return a;
        	return gcd(b, a % b);
    		}
	public static long lcm(long a, long b) {
    		return (a * b) / gcd(a, b);
		}
        public static boolean isPrime(int n) {
		if (n < 2) return false;
		if (n < 4) return true;
		if (n % 2 == 0 || n % 3 == 0) return false;
		for (int i = 5; i * i <= n; i += 6){
			if (n % i == 0 || n % (i + 2) == 0)   return false;
        }
		return true;
		}
	public static boolean[] sievePrime(int n) {
		boolean[] p = new boolean[n + 1];
		Arrays.fill(p, true);
		if (n >= 0) p[0] = false;
		if (n >= 1) p[1] = false;
		for (int i = 2; (int) i * i <= n; i++)
			if (p[i])
				for (int j = i * i; j <= n; j += i) p[j] = false;
		return p;
		}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//   boolean[] isPrime = sievePrime(100000);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
            long sum=0;
            long ans=0;
            long sum1=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
            }
            for(int i=0;i<n-1;i++){
                sum1+=a[i];
                ans=Math.max(ans,gcd(sum1,sum-sum1));
            }
            System.out.println(ans);
		}
	}
}
 
 