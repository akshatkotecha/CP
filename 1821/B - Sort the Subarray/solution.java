import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	static long mod=1000000009;
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
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int b[]=new int[n];
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            int c1=-1;
            int c2=-1;
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    if(c1==-1) c1=i;
                    else {
                        c2=i;
                      //  break;
                    }
                }
            }
            if(c2==-1) c2=n-1;
            int cur=c1-1;
            while(cur>=0){
                if(b[cur]<=b[cur+1]){
                    cur-=1;
                }
                else break;
            }
            c1=cur+1;
            cur=c2+1;
            while(cur<n){
                if(b[cur]>=b[cur-1]){
                    cur++;
                }
                else{
                    break;
                }
            }
            c2=cur-1;
            System.out.println((c1+1)+" "+(c2+1));
 
		}
	}
}
 
 