import java.util.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] first = new int[n];
            int[] second = new int[n];
 
            long K = 0;                 
            int M = Integer.MAX_VALUE;  
            int S = Integer.MAX_VALUE;  
 
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
 
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;
 
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
 
                    if (x < smallest) {
                        secondSmallest = smallest;
                        smallest = x;
                    } else if (x < secondSmallest) {
                        secondSmallest = x;
                    }
                }
 
                first[i] = smallest;
                second[i] = secondSmallest;
 
                K += secondSmallest;
                M = Math.min(M, smallest);
                S = Math.min(S, secondSmallest);
            }
 
            long ans = M + K - S;   // fixed line
            System.out.println(ans);
        }
    }
}