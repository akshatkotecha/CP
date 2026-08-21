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
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
			    a[i]=sc.nextInt();
			    b[i]=a[i];
			}
			Arrays.sort(b);
			if(!Arrays.equals(a,b) && k==1) System.out.println("NO");
			else System.out.println("YES");
			
		}
	}
}