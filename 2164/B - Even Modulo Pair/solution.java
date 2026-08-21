import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int p = 0; p < n; p++) arr[p] = in.nextLong();
 
            boolean ok = false;
            int l = 0, r = 1;
 
            while (l < n && !ok) {
                while (r < n) {
                    long u = arr[l], v = arr[r];
                    if ((v % u) % 2 == 0) {
                        System.out.println(u + " " + v);
                        ok = true;
                        break;
                    }
                    r++;
                }
                l++;
                r = l + 1;
            }
 
            if (!ok) System.out.println(-1);
        }
 
        in.close();
    }
}