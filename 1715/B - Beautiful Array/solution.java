import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    //CHATGPT GO CLAUDE PRO GEMINI PRO FTW
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
			long n=sc.nextLong();
            long k=sc.nextLong();
            long b=sc.nextLong();
            long s=sc.nextLong();
 
            long min=k*b;
            long max=min+(k-1)*n;
            boolean ok=false;
            if(s<min || s>max){
                ok=true;
            }
 
            if(ok) {
                System.out.println(-1);
                continue;
            }
 
            long a[]=new long[(int)n];
            a[0]=min;
            s-=min;
            for(int i=0;i<n;i++){
                long add=Math.min(k-1,s);
                a[i]+=add;
                s-=add;
            }
            for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();
 
		}
	}
}
 
 