import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            char[] r = sc.next().toCharArray();
            int n = r.length;
            int ans = 0;
            if (r[0] == 'u') {
                r[0] = 's';
                ans++;
            }
            if (r[n - 1] == 'u') {
                r[n - 1] = 's';
                ans++;
            }
            for (int i = 0; i < n; i++) {
                if (r[i] == 'u') {
                    int len = 0;
                    while (i < n && r[i] == 'u') {
                        len++;
                        i++;
                    }
                    ans += len / 2;
                }
            }
            System.out.println(ans);
        }
        //sc.close();
    }
}