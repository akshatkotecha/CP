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
			int pos=0; 
			for(int i=0;i<n;i++)
			{
			    a[i]=sc.nextInt();
			    if(a[i]==n) pos=i; 
			}
			if(pos!=0)
			{
			    int temp=a[0];
			    a[0]=a[pos];
			    a[pos]=temp;
			}
			for(int i=0; i<n;i++) System.out.print(a[i] + " ");
			System.out.println();
		}
	}
}