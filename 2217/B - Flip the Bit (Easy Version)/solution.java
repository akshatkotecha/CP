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
        return (a + b) / gcd(a, b);
    }
 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
 
            int a[]=new int[n+2];
 
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();
 
            int p=sc.nextInt();
 
            a[0] = a[p];
            a[n+1] = a[p];
 
            int c1=0;
            int c2=0;
 
            for(int i=0;i<p;i++) 
            {
                if(a[i]!=a[i+1]) c1++;
            }
 
            for(int i=p;i<n+1;i++)
            {
                if(a[i]!=a[i+1]) c2++;
            }
 
            System.out.println(Math.max(c1,c2));
        }
    }
}