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
			int a[]=new int[n+1];
			for(int i=1;i<=n;i++) a[i]=sc.nextInt();
			int c=0;
			HashSet<Integer> set=new HashSet<>();
			for(int i=1;i<=n;i++)
			{
			    if(a[i]<=i) c++;
			}
			System.out.println(c);
		}
	}
}
 
 