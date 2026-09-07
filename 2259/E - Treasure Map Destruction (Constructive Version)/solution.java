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
		int t=sc.nextInt();
        	//boolean prime[]=sievePrime(1000000);
		while(t-->0)
		{
			int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            int diff[]=new int[n+1];
            for(int i=0;i<n;i++){
                if(a[i]>0){
                    int left=Math.max(0,i-a[i]+1);
                    int right=Math.min(n,i+a[i]);
                    if(left<right){
                        diff[left]++;
                        diff[right]--;
                    }
                }
            }
            boolean restricted []=new boolean [n];
            int cur=0;
            for(int i=0;i<n;i++){
                cur+=diff[i];
                if(cur>0) restricted[i]=true;
            }
            boolean possible=true;
            for(int i=0;i<n;i++){
                int k=a[i];
                if(k>=0){
                    boolean left=(i-k>=0) && !restricted[i-a[i]];
                    boolean right=(i+a[i]<n) && !restricted[i+a[i]];
                    if(!left && !right) possible=false;
                }
            }
            if(!possible) System.out.println(-1);
            else{
                for(int i=0;i<n;i++){
                    if(restricted[i]) sb.append('0');
                    else sb.append('1');
                }
                System.out.println(sb);
            }
                    
		}
	}
}