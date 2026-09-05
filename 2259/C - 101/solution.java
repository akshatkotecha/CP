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
    public static int score(int[] a) {
        int prev=-1, s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                s=Math.max(s, prev==-1 ? 1 : i-prev+1);
                prev=i;
            }
        }
        return s;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		while(t-->0)
		{
			int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(a[i]==-1) list1.add(i);
            }
            if(list1.size()==0){
                for(int i=0;i<n;i++) {
                    System.out.print(a[i]+" ");
                    }
                System.out.println();
                continue;
            }
            int first=list1.get(0);
            int last=list1.get(list1.size()-1);
            for(int i=0;i<n;i++){
                if(a[i]==-1) a[i]=0;
            }
            int b[]=a.clone(); 
            b[first]=1;
            int c[]=a.clone();
            c[last]=1;
            int d[]=a.clone(); 
            d[first]=1; 
            d[last]=1;
            int ans[]=a;
            if(score(b)>score(ans)) ans=b;
            if(score(c)>score(ans)) ans=c;
            if(score(d)>score(ans)) ans=d;
            for(int i=0;i<n;i++) {
                System.out.print(ans[i]+" ");
            }
             System.out.println();
        }
	}
}