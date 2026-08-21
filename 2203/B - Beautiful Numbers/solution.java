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
			long x=sc.nextLong();
			String s=Long.toString(x);
			int n=s.length();
			int a[]=new int[n];
			long sum=0;
			for(int i=0;i<n;i++)
			{
			    a[i]=s.charAt(i)-'0';
			    sum+=a[i];
			}
			if(sum<=9)
			{
			    System.out.println(0);
			    continue;
			}
		    Integer[] red = new Integer[n];
			for(int i=0;i<n;i++)
			{
			    if(i==0) red[i]=Math.max(0,a[i]-1);
			    else red[i]=a[i];
			}
			Arrays.sort(red,(z,y)->y-z);
			int moves=0;
			for(int i=0;i<n && sum>9;i++)
			{
			    sum-=red[i];
			    moves++;
			}
			System.out.println(moves);
		}
	}
}