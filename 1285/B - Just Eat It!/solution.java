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
			long a[]=new long[n];
			for(int i=0;i<n;i++) a[i]=sc.nextLong();
			long sum=0;
			for(int i=0;i<n;i++) sum+=a[i];
			long sum2=0;
			long max1=Long.MIN_VALUE;
			long sum3=0;
			long max2=Long.MIN_VALUE;
			for(int i=1;i<n;i++)
			{
			    if(sum2<0) sum2=0;
			    sum2+=a[i];
			    max1=Math.max(max1,sum2);
			}
			for(int i=0;i<n-1;i++)
			{
			    if(sum3<0) sum3=0;
			    sum3+=a[i];
			    max2=Math.max(max2,sum3);
			}
			long max=Math.max(max1,max2);
			if(max>=sum) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}