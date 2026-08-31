import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	static long mod=1000000007;
    	//long msb=(long) (Math.log(n)/Math.log(2));
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
			if (n % i == 0 || n % (i + 2) == 0)
                return false;
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
				for (int j = i * i; j <= n; j += i)
                    p[j] = false;
 
		return p;
	}
 
    public static void reverseSort(int[] a) {
        Arrays.sort(a);
 
        int left = 0;
        int right = a.length - 1;
 
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
 
            left++;
            right--;
        }
    }
 
    public static int lowerbound(int[] a, int value) {
        int low = 0;
        int high = a.length;
 
        while (low < high) {
            int mid = low + (high - low) / 2;
 
            if (a[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
 
        return low;
    }
 
    public static int upperbound(int[] a, int value) {
        int low = 0;
        int high = a.length;
 
        while (low < high) {
            int mid = low + (high - low) / 2;
 
            if (a[mid] <= value) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
 
        return low;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
        	//boolean prime[]=sievePrime(1000000);
		while(j-->0)
		{
			int n=sc.nextInt();
            int k=sc.nextInt();
            int s=sc.nextInt();
            int t=sc.nextInt();
            long x[]=new long[n+1];
            long y[]=new long[n+1];
            for(int i=1;i<=n;i++){
                x[i]=sc.nextLong();
                y[i]=sc.nextLong();
            } 
            long ans=Math.abs(x[s]-x[t])+Math.abs(y[s]-y[t]);
            long min1=Long.MAX_VALUE/4;
            long min2=Long.MAX_VALUE/4;
            for(int i=1;i<=k;i++){
                min1=Math.min(min1,Math.abs(x[s]-x[i])+Math.abs(y[s]-y[i]));
                min2=Math.min(min2,Math.abs(x[t]-x[i])+Math.abs(y[i]-y[t]));
            }
            ans=Math.min(ans,min1+min2);
            System.out.println(ans);
		}
	}
}