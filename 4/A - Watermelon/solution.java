import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok=true;
        if(n%2!=0) ok=false;
        if(ok && n!=2)   System.out.println("YES");
        else System.out.println("NO");
 
 
        sc.close();
    }
}