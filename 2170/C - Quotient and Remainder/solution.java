import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int t = io.nextInt();
        while (t-- > 0) {
            int n = io.nextInt();
            long k = io.nextLong();
 
            long[] arr = new long[n + 1];
            long[] arr2 = new long[n + 1];
            for (int i = 1; i <= n; i++) arr[i] = io.nextLong();
            for (int i = 1; i <= n; i++) arr2[i] = io.nextLong();
 
            Arrays.sort(arr, 1, n + 1);
            Arrays.sort(arr2, 1, n + 1);
 
            int p1 = 1, p2 = n;
            int ans = 0;
 
            while (p1 <= n) {
                while (p2 >= 1 && arr2[p2] > (k - arr[p1]) / (arr[p1] + 1)) p2--;
                if (p2 < 1) break;
                ans++;
                p1++;
                p2--;
            }
 
            System.out.println(ans);
        }
    }
}