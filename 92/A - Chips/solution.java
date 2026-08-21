import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = n * (n + 1) / 2;
        m = m % total;  
        for(int i = 1; i <= n; i++)
        {
            if(m >= i)
                m -= i;
            else
                break;
        }
        System.out.println(m);
    }
}