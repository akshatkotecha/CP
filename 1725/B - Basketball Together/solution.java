import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	//	int t = sc.nextInt();
		//while(t-->0)
	//	{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			Arrays.sort(a);
			int c=0;
			int l=0;
			int r=n-1;
			int size=1;
			while(l<=r)
			{
			    if(a[r]*size<=k && l<=r)
			    {
			        size++;
			        l++;
			    }
			    else
			    {
			        c++;
			        r--;
			        size=1;
			    }
			}
			System.out.println(c);
	//	}
	}
}