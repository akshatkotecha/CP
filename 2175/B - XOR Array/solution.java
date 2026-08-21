import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            int[] b = new int[n + 1];
            int[] a = new int[n + 1];
 
            for (int i = 1; i <= n; i++) b[i] = i;
 
            b[r] = l - 1; // ensure prefix XOR equality
 
            for (int i = 1; i <= n; i++) {
                a[i] = b[i] ^ b[i - 1];
            }
 
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
                if (i < n) System.out.print(" ");
            }
            System.out.println();
        }
    }
}