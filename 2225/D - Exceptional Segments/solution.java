import java.util.*;
 
public class Main {
    static final long MOD = 998244353;
 
    static long get0(long x) {
        if (x < 0) return 0;
        return 1 + (x >= 3 ? (x - 3) / 4 + 1 : 0);
    }
 
    static long get1(long x) {
        if (x < 1) return 0;
        return (x - 1) / 4 + 1;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
 
        while(t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long l0 = get0(x - 1) % MOD;
            long r0 = (get0(n) - l0 + MOD) % MOD;
            long l1 = get1(x - 1) % MOD;
            long r1 = (get1(n) - l1 + MOD) % MOD;
            long ans = (l0 * r0) % MOD;
            ans = (ans + (l1 * r1) % MOD) % MOD;
            System.out.println(ans);
        }
    }
}