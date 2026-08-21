import java.util.*;
import java.io.*;
 
public class Codechef {
 
    static boolean check(int x) {
        int digits = 0;
        int zeros = 0;
 
        while (x > 0) {
            if (x % 10 == 0) zeros++;
            digits++;
            x /= 10;
        }
 
        return zeros == digits - 1;
    }
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int MAX = 1000000;
        int[] pref = new int[MAX];
 
        for (int i = 1; i < MAX; i++) {
            pref[i] = pref[i - 1] + (check(i) ? 1 : 0);
        }
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(pref[n]);
        }
    }
}