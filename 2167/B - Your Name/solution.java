import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
 
        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
 
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
 
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}