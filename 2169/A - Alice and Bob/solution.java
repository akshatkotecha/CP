import java.util.*;
import java.io.*;
 
public class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
 
            int left = 0, right = 0;
 
            for(int i=0;i<n;i++) {
                int x = sc.nextInt();
                if(x < a) left++;
                else if(x > a) right++;
            }
 
            if(left > right)
                System.out.println(a-1);
            else
                System.out.println(a+1);
        }
    }
}