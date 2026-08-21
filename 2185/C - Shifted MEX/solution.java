import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            
            for(int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            
            int maxLen = 1;
            int currLen = 1;
            
            for(int i = 1; i < list.size(); i++) {
                if(list.get(i) == list.get(i-1) + 1) {
                    currLen++;
                } else {
                    currLen = 1;
                }
                maxLen = Math.max(maxLen, currLen);
            }
            
            if(list.size() == 0)
                System.out.println(0);
            else
                System.out.println(maxLen);
        }
    }
}