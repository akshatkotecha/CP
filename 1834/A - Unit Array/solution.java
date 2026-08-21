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
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int c1=0;
			int c2=0;
			for(int i=0;i<n;i++)
			{
			    if(a[i]==1) c1++;
			    else c2++;
			}
			int ans=0;
			while(c1<c2 || c2%2==1)
			{
			    ans++;
			    c1++;
			    c2--;
			}
			System.out.println(ans);
		}
	}
}