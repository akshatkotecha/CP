import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> pos = new ArrayList<>();
            pos.add(-2);
            //pos.add(c);
            int existingOnes = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    pos.add(i);
                    existingOnes++;
                }
            }
            pos.add(n + 1);
            long total = existingOnes;
            for (int i = 0; i < pos.size() - 1; i++) {
                int gapLength = pos.get(i + 1) - pos.get(i) - 1;
                total += gapLength / 3;
            }
            System.out.println(total);
        }
        sc.close();
    }
}