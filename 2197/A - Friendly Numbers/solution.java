import java.util.*;
 
public class Main {
 
    static int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long x = sc.nextLong();
            int count = 0;
 
            for (long y = x; y <= x + 83; y++) {
                if (y - digitSum(y) == x) {
                    count++;
                }
            }
 
            System.out.println(count);
        }
    }
}