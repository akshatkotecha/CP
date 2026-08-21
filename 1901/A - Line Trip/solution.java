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
			int k=sc.nextInt();
			int a[]=new int[n+1];
			a[0]=0;
			for(int i=1;i<n+1;i++) a[i]=sc.nextInt();
			int min=Integer.MIN_VALUE;
			for(int i=1;i<n+1;i++) min=Math.max(a[i]-a[i-1],min);
			min=Math.max(min,2*(k-a[n]));
			System.out.println(min);
		}
	}
}