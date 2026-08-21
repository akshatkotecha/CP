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
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            int max=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]=='1') max++;
                else if(i>0 && i<n-1 && a[i-1]=='1' && a[i+1]=='1' && a[i]=='0')
                {
                    max++;
                    a[i]='1';
                }
            }
            int c=0;
            int min=0;
            for(int i=1;i<n-1;i++)
            {
                if(a[i]=='1' && a[i-1]=='1'&& a[i+1]=='1')  
                {
                    a[i]='0';
                }
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]=='1') min++;
            }
            System.out.println(min +" "+max);
        }
    }
}