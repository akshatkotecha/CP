import java.util.*;
 
public class Main {
 
    // Checks if we can distribute all bits into x numbers
    static boolean good(long x, long[][] buffs) {
        long carry = 0;
 
        for (int i = 0; i < buffs.length; i++) {
            long bit = buffs[i][0];
            long count = buffs[i][1];
 
            if (count <= x) {
                if (carry == 0) continue;
 
                long reduce = (x - count) * bit;
                carry = Math.max(carry - reduce, 0);
            } else {
                carry += (count - x) * bit;
            }
        }
 
        return carry == 0;
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
 
        while (t-- > 0) {
 
            long s = sc.nextLong();
            long m = sc.nextLong();
 
            ArrayList<Long> bits = new ArrayList<>();
 
            long mul = 1;
 
            // Extract all powers of two set in m
            for (int i = 0; i < 62; i++) {
                if ((m & mul) != 0) {
                    bits.add(mul);
                }
                mul <<= 1;
            }
 
            // Process largest bit first
            Collections.reverse(bits);
 
            long cur = s;
            long maxVal = 0;
 
            long[][] buffs = new long[bits.size()][2];
 
            // Greedy decomposition of s into allowed bits
            for (int i = 0; i < bits.size(); i++) {
                long bit = bits.get(i);
 
                buffs[i][0] = bit;
                buffs[i][1] = cur / bit;
 
                maxVal = Math.max(maxVal, buffs[i][1]);
 
                cur %= bit;
            }
 
            // Impossible if remainder is left
            if (cur != 0) {
                System.out.println(-1);
                continue;
            }
 
            // Binary search to find minimum n
            long l = 0, r = maxVal;
 
            while (l < r - 1) {
                long mid = (l + r) / 2;
 
                if (good(mid, buffs))
                    r = mid;
                else
                    l = mid;
            }
 
            System.out.println(r);
        }
 
        sc.close();
    }
}