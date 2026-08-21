import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            HashMap<Integer, Integer> freq=new HashMap<>();
            for (int i=0;i<n*n;i++) {
                int x=sc.nextInt();
                freq.put(x,freq.getOrDefault(x,0)+1);
            }
            int maxFreq=0;
            for (int val : freq.values()) {
                maxFreq=Math.max(maxFreq, val);
            }
            if (maxFreq>n*(n-1)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}