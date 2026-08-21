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
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int c=1;
			int l=a[0];
			for(int i=1;i<n;i++) 
			{
			    if(a[i]<=a[i-1]+1  && a[i]>l) continue;
			    c++;
			    l=a[i];
			}
			
			System.out.println(c);
		}
	}
}