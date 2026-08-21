import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            
            for(int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            
            long b[] = new long[n + 1]; // prefix abs
            long c[] = new long[n];     // suffix neg
            
            for(int i = 1; i < n; i++)
                b[i + 1] = b[i] + Math.abs(a[i]);
            
            for(int i = n - 1; i >= 1; i--)
                c[i - 1] = c[i] - a[i];
            
            long ans = c[0];
            
            for(int i = 1; i < n; i++)
            {
                long cur = a[0] + b[i] + c[i];
                ans = Math.max(ans, cur);
            }
            
            System.out.println(ans);
        }
    }
}