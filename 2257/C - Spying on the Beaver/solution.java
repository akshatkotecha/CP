import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
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
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n-1];
	        for(int i=0;i<n-1;i++) a[i]=sc.nextInt();
            int m=sc.nextInt();
            int b[]=new int[m];
            for(int i=0;i<m;i++) b[i]=sc.nextInt();
            System.out.print(m-1+" ");
            int min=b[0];
            for(int i=0;i<m;i++) min=Math.min(min,b[i]);
            for(int i=0;i<m;i++){
                if(b[i]==min) continue;
                else System.out.print(b[i]+" ");
            }
            System.out.println();
 
            
            
		}
	}
}
 
 