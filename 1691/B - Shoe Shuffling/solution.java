import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
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
	        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int num : a){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            boolean ok=false;
            for(int num : map.keySet()){
                if(map.get(num)==1) ok=true;
            }
            if(ok){
                System.out.println(-1);
                continue;
            }
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=1;i<=n;i++) list.add(i);
            int l=0;
            int r=0;
            while(r<n){
                if(a[l]==a[r]){
                    r++;
                }
                else{
                    Collections.rotate(list.subList(l,r),-1);
                    l=r;
                }
            }
            Collections.rotate(list.subList(l,r),-1);
            for(int num : list){
                System.out.print(num+" ");
            }
            System.out.println();
		}
	}
}
 
 