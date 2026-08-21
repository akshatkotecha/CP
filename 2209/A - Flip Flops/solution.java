import java.util.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			long c=sc.nextLong();
			long k=sc.nextLong();
			long a[]=new long[n];
			for(int i=0;i<n;i++) a[i]=sc.nextLong();
			Arrays.sort(a);
			for(int i=0;i<n;i++)
			{
			    if(a[i]<=c) 
			    {
			        long need =c-a[i];
			        long use =Math.min(k,need);
			        a[i]+=use;
			        k-=use;
			        c+=a[i];
			    }
			    else break;
			}
			System.out.println(c);
		}
	}
}