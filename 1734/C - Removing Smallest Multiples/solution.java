import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            boolean[] done = new boolean[n + 1];
            
            long ans = 0;
            
            for (int k = 1; k <= n; k++) {
                for (int j = k; j <= n; j += k) {
                    if (arr[j - 1] == '1') break;
                    
                    if (!done[j]) {
                        ans += k;
                        done[j] = true;
                    }
                }
            }
            
            System.out.println(ans);
        }
    }
}