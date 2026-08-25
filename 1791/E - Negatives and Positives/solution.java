import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	//long msb = (long) (Math.log(n) / Math.log(2));
	public static int gcd(int a, int b) {
        	if (b == 0) return a;
        	return gcd(b, a % b);
    		}
	public static int lcm(int a, int b) {
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
        //    int k=sc.nextInt();
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int max=1;
            int neg=0;
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=Math.abs(a[i]);
                if(a[i]<0) {
                    a[i]=-a[i];
                    neg++;
                }
 
            }
            if(neg%2==1){
                Arrays.sort(a);
                sum-=2*(a[0]);
            }
            System.out.println(sum);
		}
	}
}
 
 