import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char target = s.charAt(n - 1);
            int ops = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != target) ops++;
            }
            System.out.println(ops);
        }
    }
}