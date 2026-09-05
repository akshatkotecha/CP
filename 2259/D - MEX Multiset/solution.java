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
        StringBuilder sb=new StringBuilder();
		while(t-->0)
		{
			int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            HashMap<Integer,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.computeIfAbsent(a[i],k-> new ArrayList<>()).add(i);
            }
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(a[i]==0) list.add(i);
            }
            if(list.size()==0){
                sb.append("YES
");
                for(int i=0;i<n;i++) sb.append("A");
                sb.append("
");
                continue;
            }
            if(list.size()==1){
                sb.append("NO
");
                continue;
            }
            char res[]=new char[n];
            for(int i=0;i<n;i++) res[i]='C';
            if(list.size()==2){
                res[list.get(0)]='A';
                res[list.get(1)]='B';
                sb.append("YES
").append(new String(res)).append("
");
                continue;
            }
            int x=0;
            while(map.containsKey(x) && map.get(x).size()>=2) x++;
            for(int i=0;i<x;i++){
                List<Integer> list1=map.get(i);
                res[list1.get(0)]='A';
                res[list1.get(1)]='B';
            }
            if(map.containsKey(x) && map.get(x).size()==1){
                res[map.get(x).get(0)]='A';
            }
            sb.append("YES
").append(new String(res)).append("
");
		}
        System.out.println(sb);
	}
}