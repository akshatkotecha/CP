import java.util.*;
 
public class Main {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) set.add(sc.nextLong());
            long ans = -1;
            for (long x = 2; x <= 1000000; x++) {
                boolean ok = false;
                for (long a : set) {
                    if (gcd(a, x) == 1) {
                        ok = true;
                        break;
                    }
                }
                if (ok) {
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}