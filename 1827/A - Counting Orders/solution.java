import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	static long mod=1000000007;
 
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
 
		int t=sc.nextInt();
 
		while(t-->0)
		{
			int n=sc.nextInt();
 
			int a[]=new int[n];
			for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
 
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();
 
            Arrays.sort(a);
            reverseSort(b);
 
            long res=1;
 
            for(int i=0;i<n;i++){
                int temp=upperbound(a,b[i]);
                long count=n-temp;
 
                res=res*Math.max(0,count-i)%mod;
            }
 
            System.out.println(res);
		}
	}
}