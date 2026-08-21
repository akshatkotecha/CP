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
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            if(a%(x+y)<x) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}