import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static int gcd(int a, int b) {
        	if (b == 0) return a;
        	return gcd(b, a % b);
    		}
	public static int lcm(int a, int b) {
    		return (a + b) / gcd(a, b);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			for(int i=0;i<m;i++) b[i]=sc.nextInt();
			PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
			for(int i=0;i<n;i++) 
			{
			    if((i+1)%2==1) pq1.add(a[i]);
			    else pq2.add(a[i]);
			}
			int k1=0;
			int k2=0;
			for(int i=0;i<m;i++)
			{
			    if(b[i]%2==1) k1++;
			    else k2++;
			}
		    long sum=0;
		    for(int i=0;i<n;i++) sum+=(long)a[i];
		    long sum1=0;
		    long sum2=0;
		    if(k1>0 && !pq1.isEmpty())
		    {
		        sum1+=(long)pq1.poll();
		        k1--;
		    }
		    if(k2>0 && !pq2.isEmpty())
		    {
		        sum2+=(long)pq2.poll();
		        k2--;
		    }
		    while(k1>0 && !pq1.isEmpty() && pq1.peek()>0)
		    {
		        int l=pq1.poll();
		        sum1+=(long)l;
		        k1--;
		    }
		    while(k2>0 && !pq2.isEmpty() && pq2.peek()>0)
		    {
		        int j=pq2.poll();
		        sum2+=(long)j;
		        k2--;
		    }
		    System.out.println(sum-sum1-sum2);
		}
	}
}
 
 