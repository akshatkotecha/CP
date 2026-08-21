import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
        {
            int n=sc.nextInt();
            boolean ok=true;
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    int k=n/i;
                    System.out.println(k+" "+(n-k));
                    ok=false;
                    break;
                }
            }
            if(ok) System.out.println((n-1)+" "+1);
        }
	}
}