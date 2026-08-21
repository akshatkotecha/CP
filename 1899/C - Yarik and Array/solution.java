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
			int sum=a[0];
			int max=a[0];
			for(int i=1;i<n;i++)
			{
			    int c=0;
			    int d=0;
			    if(Math.abs(a[i-1])%2==1) c++;
                if(Math.abs(a[i-1])%2==0) d++;
                if(Math.abs(a[i])%2==1)   c++;
                if(Math.abs(a[i])%2==0)   d++;
			    if(sum<0 || c==2 || d==2) sum=a[i];
			    else sum+=a[i];
			    max=Math.max(sum,max);
			}
			System.out.println(max);
			
		}
	}
}