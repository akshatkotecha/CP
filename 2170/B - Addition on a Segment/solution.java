import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;        // use long
            int nonZero = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;        // safe, sum is long
                if (x != 0) nonZero++;
            }
 
            long candidate = sum - n + 1;        // computed in long
            long ans;
 
            if (sum == n) {
                ans = 1;
            } else {
                ans = Math.min(nonZero, candidate);
            }
 
            System.out.println(ans);
        }
    }
}