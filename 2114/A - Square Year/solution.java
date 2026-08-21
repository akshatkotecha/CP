import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int k=Integer.parseInt(s);
            int m=(int) Math.sqrt(k);              
            if(m*m==k) System.out.println(0 + " " + m);
            else System.out.println(-1);
        }
    }
}