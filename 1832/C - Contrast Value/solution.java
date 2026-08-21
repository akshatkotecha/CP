import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            ArrayList<Long> v = new ArrayList<>();
            v.add(a[0]);
            for (int i = 1; i < n; i++)
            {
                if (a[i] != a[i - 1]) v.add(a[i]);
            }
            int m = v.size();
            if (m == 1) {
                System.out.println(1);
                continue;
            }
            int ans = 2; 
            for (int i = 1; i < m - 1; i++) {
                long d1 = v.get(i) - v.get(i - 1);
                long d2 = v.get(i + 1) - v.get(i);
 
                if (d1 * d2 < 0) ans++;
            }
            System.out.println(ans);
        }
    }
}