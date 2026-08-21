import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
 
	   while (t-- > 0)
	   {
	       int n = sc.nextInt();
	       long h = sc.nextLong();
	       long k = sc.nextLong();
 
	       int[] a = new int[n];
	       for (int i = 0; i < n; i++) a[i] = sc.nextInt();
 
	       long S = 0;
	       for (int x : a) S += x;
 
	       long f = (h - 1) / S;
	       long rem = h - f * S;
 
	       if (rem == 0)
	       {
	           System.out.println(f * (n + k));
	           continue;
	       }
 
	       long[] pref = new long[n + 1];
	       for (int i = 0; i < n; i++)
	           pref[i + 1] = pref[i] + a[i];
 
	       int[] minPref = new int[n + 1];
	       minPref[1] = a[0];
	       for (int i = 2; i <= n; i++)
	           minPref[i] = Math.min(minPref[i - 1], a[i - 1]);
 
	       int[] maxSuf = new int[n + 1];
	       maxSuf[n] = Integer.MIN_VALUE;
	       for (int i = n - 1; i >= 0; i--)
	           maxSuf[i] = Math.max(maxSuf[i + 1], a[i]);
 
	       int bestI = n;
 
	       for (int i = 1; i <= n; i++)
	       {
	           long cur = pref[i];
 
	           if (i < n)
	           {
	               int mn = minPref[i];
	               int mx = maxSuf[i];
 
	               if (mx > mn)
	                   cur = cur - mn + mx;
	           }
 
	           if (cur >= rem)
	           {
	               bestI = i;
	               break;
	           }
	       }
 
	       long ans = f * (n + k) + bestI;
	       System.out.println(ans);
	   }
	}
}