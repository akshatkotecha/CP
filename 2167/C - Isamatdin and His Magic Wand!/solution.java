import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            ArrayList<Integer> evens = new ArrayList<>();
            ArrayList<Integer> odds = new ArrayList<>();
 
            for (int x : a) {
                if (x % 2 == 0) evens.add(x);
                else odds.add(x);
            }
 
            if (evens.isEmpty() || odds.isEmpty()) {
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                continue;
            }
 
            Collections.sort(evens);
            Collections.sort(odds);
 
            int e = 0, o = 0;
            for (int i = 0; i < n; i++) {
                if (e < evens.size() && o < odds.size()) {
                    if (evens.get(e) < odds.get(o)) {
                        a[i] = evens.get(e++);
                    } else {
                        a[i] = odds.get(o++);
                    }
                } else if (e < evens.size()) {
                    a[i] = evens.get(e++);
                } else {
                    a[i] = odds.get(o++);
                }
            }
 
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}