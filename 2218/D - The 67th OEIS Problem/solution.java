import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    static ArrayList<Long> primes = new ArrayList<>();
 
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    public static int lcm(int a, int b) {
        return (a + b) / gcd(a, b);
    }
 
    public static void makePrimes(long maxNeeded) {
        int limit = 2000000;
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
 
        isPrime[0] = false;
        isPrime[1] = false;
 
        for (int i = 2; i < limit && primes.size() < maxNeeded; i++) {
            if (isPrime[i]) {
                primes.add((long)i);
                for (long j = (long)i * i; j < limit; j += i) {
                    isPrime[(int)j] = false;
                }
            }
        }
    }
 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
 
        makePrimes(100000);
 
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
 
            if(n == 1){
                System.out.println(2);
                continue;
            }
 
            long[] arr = new long[n];
 
            arr[0] = primes.get(1);
 
            for(int i = 1; i < n-1; i++){
                arr[i] = primes.get(i) * primes.get(i+1);
            }
 
            arr[n-1] = primes.get(n-1);
 
            for(long x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}