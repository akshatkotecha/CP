import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();
 
            if (p < q && Math.min(p / 2, q / 3) >= (q - p)) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }
}