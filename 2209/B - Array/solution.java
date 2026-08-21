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
			int b[]=new int[n];
			b[n-1]=0;
			for(int i=0;i<n;i++)
			{
			    int s=0,l=0;
			    for(int j=i+1;j<n;j++)
			    {
			        if(a[j]>a[i]) l++;
			        else if(a[j]<a[i]) s++;
			    }
			    b[i]=Math.max(s,l);
			}
			for(int i=0;i<n;i++) System.out.print(b[i]+ " ");
			System.out.println();
		}
	}
}