import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b) System.out.println(0);
            else if(a>b && a%b==0) System.out.println(1);
            else if(b>a && b%a==0) System.out.println(1);
            else System.out.println(2);
        }
    }
}