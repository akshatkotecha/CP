import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            long total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += Math.abs(a[i] - a[i + 1]);
            }
 
            long ans = total;
 
            // Remove first
            ans = Math.min(ans, total - Math.abs(a[0] - a[1]));
 
            // Remove last
            ans = Math.min(ans, total - Math.abs(a[n - 2] - a[n - 1]));
 
            // Remove middle
            for (int i = 1; i < n - 1; i++) {
                long cur = total
                        - Math.abs(a[i - 1] - a[i])
                        - Math.abs(a[i] - a[i + 1])
                        + Math.abs(a[i - 1] - a[i + 1]);
                ans = Math.min(ans, cur);
            }
 
            System.out.println(ans);
        }
    }
}