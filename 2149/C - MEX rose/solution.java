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
			int k=sc.nextInt();
			int b[]=new int[n+1];
			for(int i=0;i<n;i++) 
			{
			    a[i]=sc.nextInt();
			    b[a[i]]++;
			}
			int missing = 0;
			for(int i=0;i<k;i++)
			{
			    if(b[i]==0) missing++;
			}
			int extra=b[k];
			System.out.println(Math.max(missing, extra));
		}
	}
}