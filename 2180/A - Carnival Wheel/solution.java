import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            HashSet<Integer> seen = new HashSet<>();
 
            int current = a;
            int maxPrize = a;
 
            while (!seen.contains(current)) {
                seen.add(current);
                maxPrize = Math.max(maxPrize, current);
                current = (current + b) % l;
            }
 
            System.out.println(maxPrize);
        }
        sc.close();
    }
}