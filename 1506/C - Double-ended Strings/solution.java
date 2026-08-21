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
			String a=sc.next();
			String b=sc.next();
			
			int n=a.length();
			int m=b.length();
			
			int max=0;
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					int k=0;
					
					while(i+k<n && j+k<m && a.charAt(i+k)==b.charAt(j+k))
					{
						k++;
					}
					
					max=Math.max(max,k);
				}
			}
			
			System.out.println(n+m-2*max);
		}
	}
}