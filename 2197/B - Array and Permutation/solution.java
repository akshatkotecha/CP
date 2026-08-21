import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] p = new int[n];
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
 
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
 
            int[] pos = new int[n + 1];
            for (int i = 0; i < n; i++) {
                pos[p[i]] = i;
            }
 
            boolean possible = true;
 
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1]) {
                    if (pos[a[i]] > pos[a[i + 1]]) {
                        possible = false;
                        break;
                    }
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}