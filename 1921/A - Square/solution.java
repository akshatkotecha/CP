import java.util.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int[] x = new int[4];
 
            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextInt(); 
                sc.nextInt();        
            }
 
            Arrays.sort(x);
 
            int side = x[3] - x[0];
            System.out.println(side * side);
        }
    }
}