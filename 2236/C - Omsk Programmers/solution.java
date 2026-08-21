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
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=sc.nextInt();
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			pq.add(Math.abs(a-b));
		//	if(a==b){
		//	    System.out.println(0);
		//	    continue;
		//	}
			if(a<x && b<x) {
			    System.out.println(Math.min(Math.abs(a-b),2));
			    continue;
			}
		int ans=0;
			while(a>0 && b>0){
			    if(a>b) a/=x;
			    else b/=x;
			    ans++;
			  //  {
			        if(a<x && b<x){
			            pq.add(ans+Math.min(Math.abs(a-b),2));
			            break;
			        }
			  //  }
			    pq.add(Math.abs(a-b)+ans);
			}
			System.out.println(pq.poll());
			
			
			
			
			
		}
	}
}
 
 