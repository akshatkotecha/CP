import java.util.*;
 
public class Codechef {
 
    static int f(int x) {
        while (x % 2 == 0) x /= 2;
        return x;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                if (f(i) != f(x)) {
                    ok = false;
                    //break;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}