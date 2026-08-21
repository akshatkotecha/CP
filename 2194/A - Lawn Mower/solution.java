import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
	       int n  = sc.nextInt();
	       int w = sc.nextInt();
	       int max_removed = n-(n/w);
	       System.out.println(max_removed);
        }
    }
}