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
 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long[] a=new long[n+1];
            for(int i=1;i<=n;i++)  a[i]=sc.nextLong();
            int[] b=new int[m];
            for(int i=0;i<m;i++)  b[i] = sc.nextInt();
            Arrays.sort(b);
            long[] pref=new long[n+1];
            for(int i=1;i<=n;i++) pref[i]=pref[i-1]+a[i];
            long sum=pref[n]-pref[b[m - 1]];
            long dp0=sum;
            long dp1=sum;
            for (int j=m-1;j>=0;j--)
            {
                int left=(j==0) ? 0:b[j - 1];
                int right=b[j];
                long current=pref[right]-pref[left];
                long nextDp0=Math.max(dp0+current,dp1+current);
                long nextDp1=Math.max(dp1-current,dp0-current);
                dp0=nextDp0;
                dp1=nextDp1;
            }
            System.out.println(Math.max(dp0,dp1));
        }
    }
}