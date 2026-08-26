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
            int sum1=a[0];
            int left=0;
            int right=n-1;
            int sum2=a[n-1];
            int ans=2;
            int h=2;
            boolean ok=false;
            while(left<right){
                if(sum1<sum2){
                    left++;
                    sum1+=a[left];
                    ans++;
                }
                else if(sum2<sum1){
                    right--;
                    sum2+=a[right];
                    ans++;
                }
                else{
                    ok=true;
                    h=ans;
                    ans+=2;
                    left++;
                    right--;
                    sum1+=a[left];
                    sum2+=a[right];
                }
            }
            if(!ok) System.out.println(0);
            else System.out.println(h);
            
		}
	}
}
 
 