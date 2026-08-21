import java.util.*;
import java.io.*;
 
public class B_Distinct_Elements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long b[] = new long[n+1];   // changed to long
            
            for(int i = 1; i <= n; i++)
                b[i] = sc.nextLong();   // changed to nextLong()
            
            ArrayList<Integer> res = new ArrayList<>();
            
            for(int i = 0; i < n; i++)
            {
                long diff = b[i+1] - b[i];
                
                if(i - diff >= 0)
                {
                    res.add(res.get((int)(i - diff)));
                }
                else
                {
                    res.add(i + 1);
                }
            }
            
            for(int x : res)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}