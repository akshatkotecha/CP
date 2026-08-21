import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
 
            ArrayList<Integer> m = new ArrayList<>();
            for (int i = x; i < y; i++) m.add(a[i]);
 
            if (!m.isEmpty())
            {
                int mn = m.get(0), pos = 0;
                for (int i = 1; i < m.size(); i++)
                    if (m.get(i) < mn)
                    {
                        mn = m.get(i);
                        pos = i;
                    }
 
                ArrayList<Integer> b = new ArrayList<>();
                for (int i = 0; i < m.size(); i++)
                    b.add(m.get((pos + i) % m.size()));
 
                m = b;
            }
 
            ArrayList<Integer> o = new ArrayList<>();
            for (int i = 0; i < x; i++) o.add(a[i]);
            for (int i = y; i < n; i++) o.add(a[i]);
 
            int p = m.isEmpty() ? Integer.MAX_VALUE : m.get(0);
 
            int i = 0;
            while (i < o.size() && o.get(i) < p)
            {
                System.out.print(o.get(i) + " ");
                i++;
            }
 
            for (int v : m) System.out.print(v + " ");
 
            while (i < o.size())
            {
                System.out.print(o.get(i) + " ");
                i++;
            }
 
            System.out.println();
        }
    }
}