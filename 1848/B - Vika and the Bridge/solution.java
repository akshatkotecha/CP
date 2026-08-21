import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            ArrayList<Integer>[] pos = new ArrayList[k + 1];
            for (int i = 1; i <= k; i++) {
                pos[i] = new ArrayList<>();
                pos[i].add(0);
            }
 
            for (int i = 1; i <= n; i++) {
                int c = sc.nextInt();
                pos[c].add(i);
            }
 
            int ans = n;
 
            for (int color = 1; color <= k; color++) {
                pos[color].add(n + 1);
 
                int g1 = 0, g2 = 0;
 
                for (int i = 1; i < pos[color].size(); i++) {
                    int gap = pos[color].get(i) - pos[color].get(i - 1) - 1;
 
                    if (gap > g1) {
                        g2 = g1;
                        g1 = gap;
                    } else if (gap > g2) {
                        g2 = gap;
                    }
                }
 
                int candidate = Math.max(g1 / 2, g2);
                ans = Math.min(ans, candidate);
            }
 
            System.out.println(ans);
        }
    }
}