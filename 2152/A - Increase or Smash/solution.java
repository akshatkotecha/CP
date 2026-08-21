import java.util.*;
import java.io.*;
 
public class A_Increase_or_Smash
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            HashSet<Integer> set= new HashSet<>();
            for(int i=0;i<n;i++) set.add(a[i]);
            System.out.println(set.size()*2-1);
        }
    }
}