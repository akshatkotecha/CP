import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    // ---------- MAX ----------
    static int max(int[] arr){
        int mx = arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i] > mx) mx = arr[i];
        return mx;
    }
 
    // ---------- MIN ----------
    static int min(int[] arr){
        int mn = arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i] < mn) mn = arr[i];
        return mn;
    }
 
    // ---------- SWAP ----------
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    // ---------- PREFIX SUM ----------
    static long[] prefixSum(int[] arr){
        int n = arr.length;
        long[] pre = new long[n];
        pre[0] = arr[0];
        for(int i=1;i<n;i++)
            pre[i] = pre[i-1] + arr[i];
        return pre;
    }
 
    // ---------- SUFFIX SUM ----------
    static long[] suffixSum(int[] arr){
        int n = arr.length;
        long[] suf = new long[n];
        suf[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
            suf[i] = suf[i+1] + arr[i];
        return suf;
    }
 
    // ---------- GCD ----------
    static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    // ---------- LCM ----------
    static long lcm(long a, long b){
        return (a / gcd(a,b)) * b;
    }
 
    // ---------- SIEVE : primes upto n ----------
    static ArrayList<Integer> sieve(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
 
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i)
                    prime[j] = false;
            }
        }
 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++)
            if(prime[i]) list.add(i);
 
        return list;
    }
 
    // ---------- PRIME FACTORS ----------
    static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }
        if(n > 1) factors.add(n);
        return factors;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++) a[i] = sc.nextInt();
		    int c=0;
		    int z=0;
		    int g=0;
		    int ans=0;
		    for(int i=0;i<n;i++){
		        if(a[i]==0) c++;
		        else if(a[i]==-1)z++;
		        else g++;
		    }
		    ans=c;
		    if(z%2==1) ans+=2;
		    System.out.println(ans);
		}
	}
}