import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
 
            if (k == 2 || k == 3 || k == 5) {
                int min = Integer.MAX_VALUE;
                boolean ok = false;
                for (int x : a) {
                    if (x % k == 0) { ok = true; break; }
                    min = Math.min(min, k - x % k);
                }
                System.out.println(ok ? 0 : min);
            } else {
                int cnt2 = 0, minEven = Integer.MAX_VALUE, minFour = Integer.MAX_VALUE;
                for (int x : a) {
                    int y = x;
                    while (y % 2 == 0) { cnt2++; y /= 2; }
                    if (x % 2 != 0) minEven = 1;
                    if (x % 4 != 0) minFour = Math.min(minFour, 4 - x % 4);
                }
                if (cnt2 >= 2) System.out.println(0);
                else if (cnt2 == 1) System.out.println(minEven);
                else System.out.println(Math.min(minFour, minEven * 2));
            }
        }
    }
}