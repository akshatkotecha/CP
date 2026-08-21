//2074B
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
    		return (a * b) / gcd(a, b);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<n;i++) pq.offer(a[i]);
			while(pq.size()>1)
			{
			    int m=pq.poll();
			    int k=pq.poll();
			    pq.add(m+k);
			}
			System.out.println(pq.peek()-n+1);
			
		}
	}
}
 
 