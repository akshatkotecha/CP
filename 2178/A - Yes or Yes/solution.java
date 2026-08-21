import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int y = 0;
            for (int i = 0; i < s.length(); i++)   if (s.charAt(i) == 'Y') y++;
            System.out.println(y <= 1 ? "YES" : "NO");
        }
    }
}