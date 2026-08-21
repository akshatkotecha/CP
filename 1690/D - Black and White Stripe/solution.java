import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			int b=0;
			for(int i=0;i<k;i++)
			{
			    if(s.charAt(i)=='B') b++;
			}
			if(b==k)
			{
			    System.out.println(0);
			    continue;
			}
			int min=k-b;
			for(int i=1;i<=n-k;i++)
			{
			    if(s.charAt(i-1)=='B') b--;
			    if(s.charAt(i+k-1)=='B') b++;
			    min=Math.min(min,k-b);
			}
			System.out.println(min);
			
		}
	}
}