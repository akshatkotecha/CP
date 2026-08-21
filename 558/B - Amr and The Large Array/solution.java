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
		for (int i = 2; i * i <= n; i++)
			if (p[i])
				for (int j = i * i; j <= n; j += i) p[j] = false;
		return p;
		}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
            int  a[]=new int[n];
            HashMap<Integer,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                map.putIfAbsent(a[i], new ArrayList<>());
                map.get(a[i]).add(i);
            }
            int max_freq=0;
            for(int num : map.keySet()){
                List<Integer> list1=new ArrayList<>(map.get(num));
                max_freq=Math.max(max_freq,list1.size());
            }
            int ans1=0;
            int ans2=0;
            int len=Integer.MAX_VALUE;
            for(int num : map.keySet()){
                List<Integer> list1=new ArrayList<>(map.get(num));
                if(list1.size()==max_freq){
                    int l=list1.get(0)+1;
                    int r=list1.get(list1.size()-1)+1;
                    int cur=r-l+1;
                    if(cur<len){
                        ans1=l;
                        ans2=r;
                        len=r-l+1;
                    }
                }
            }
            System.out.println(ans1+" "+ans2);
	}
}
 
 