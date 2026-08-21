import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
 
            int keptCount = 0;
            int maxSoFar = 0;
 
            for(int i = 0; i < n; i++){
                if(a[i] >= maxSoFar){
                    maxSoFar = a[i];
                    keptCount++;
                }
            }
 
            int answer = n - keptCount;
            System.out.println(answer);
        }
    }
}