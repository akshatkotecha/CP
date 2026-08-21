import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            boolean found=false;
            for(int i=0;i<6;i++)
            {
                if(x.contains(s))
                {
                    System.out.println(i);
                    found=true;
                    break;
                }
                x += x;
            }
           if(!found) System.out.println(-1);
        }
    }
}