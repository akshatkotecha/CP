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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            HashMap<Integer, Integer> occ = new HashMap<>();
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                occ.put(a[i], occ.getOrDefault(a[i], 0) + 1);
            }
            if(occ.size() >= 3)
            {
                System.out.println("No");
            }
            else
            {
                int mn = Integer.MAX_VALUE;
                int mx = Integer.MIN_VALUE;
                for(int x : occ.values())
                {
                    mn = Math.min(mn, x);
                    mx = Math.max(mx, x);
                }
                if(Math.abs(mx - mn) <= 1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}