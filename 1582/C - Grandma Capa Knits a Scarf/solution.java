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
 
    // ==================== PRINT HELPERS ====================
 
    public static void yn(boolean b) {
        System.out.println(b ? "YES" : "NO");
    }
 
    public static void printArray(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }
 
    public static void printArray(long[] a) {
        for (long x : a)
            System.out.print(x + " ");
        System.out.println();
    }
 
    public static void printArray(double[] a) {
        for (double x : a)
            System.out.print(x + " ");
        System.out.println();
    }
 
    public static void printArray(String[] a) {
        for (String x : a)
            System.out.print(x + " ");
        System.out.println();
    }
 
    public static void printList(List<?> a) {
        for (Object x : a)
            System.out.print(x + " ");
        System.out.println();
    }
 
    public static void printMatrix(int[][] a) {
        for (int[] row : a)
            printArray(row);
    }
 
    // ==================== ARRAY HELPERS ====================
 
    public static void sort(int[] a) {
        Arrays.sort(a);
    }
 
    public static void sort(long[] a) {
        Arrays.sort(a);
    }
 
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
 
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
 
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
 
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
 
    public static int minArray(int[] a) {
        int ans = a[0];
 
        for (int x : a)
            ans = Math.min(ans, x);
 
        return ans;
    }
 
    public static int maxArray(int[] a) {
        int ans = a[0];
 
        for (int x : a)
            ans = Math.max(ans, x);
 
        return ans;
    }
 
    public static long minArray(long[] a) {
        long ans = a[0];
 
        for (long x : a)
            ans = Math.min(ans, x);
 
        return ans;
    }
 
    public static long maxArray(long[] a) {
        long ans = a[0];
 
        for (long x : a)
            ans = Math.max(ans, x);
 
        return ans;
    }
 
    public static int sum(int[] a) {
        int ans = 0;
 
        for (int x : a)
            ans += x;
 
        return ans;
    }
 
    public static long sum(long[] a) {
        long ans = 0;
 
        for (long x : a)
            ans += x;
 
        return ans;
    }
 
    // ==================== MATH HELPERS ====================
 
    public static long power(long a, long b) {
        long ans = 1;
 
        while (b > 0) {
            if ((b & 1) == 1)
                ans *= a;
 
            a *= a;
            b >>= 1;
        }
 
        return ans;
    }
 
    public static long powerMod(long a, long b) {
        long ans = 1;
 
        while (b > 0) {
            if ((b & 1) == 1)
                ans = (ans * a) % mod;
 
            a = (a * a) % mod;
            b >>= 1;
        }
 
        return ans;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        	//boolean prime[]=sievePrime(1000000);
		while(t-->0)
		{
			int n=sc.nextInt();
            String s=sc.next();
            int ans=Integer.MAX_VALUE;
            for(char ch='a';ch<='z';ch++){
                int temp=0;
                boolean ok=true;
                int i=0;
                int j=n-1;
                while(i<j){
                    if(s.charAt(i)==s.charAt(j)){
                        i++;
                        j--;
                        continue;
                    }
                    if(s.charAt(i)==ch){
                        temp++;
                        i++;
                    }
                    else if(s.charAt(j)==ch){
                        temp++;
                        j--;
                    }
                    else{
                        ok=false;
                        break;
                    }
                }
                if(!ok) temp=Integer.MAX_VALUE; 
                ans=Math.min(ans,temp);
            }
            if(ans==Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(ans);
		}
	}
}