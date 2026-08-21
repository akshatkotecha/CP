import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int sum=0;
		Arrays.sort(a);
		for(int i=0;i<m;i++)
		{
		    if(a[i]<0) sum+=a[i];
		}
		System.out.println(Math.abs(sum));
		
	}
}
 