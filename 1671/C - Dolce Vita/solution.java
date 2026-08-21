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
    public static boolean check(long val,int ind,int x, int mid){
        return val+(1L*(ind+1)*(mid-1))<=x;
    }		
    public static int binsearch(long val,int ind,int x){
        int low= 1,high=1000000005;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(val,ind,x,mid)){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a[]=new int[n];
		    for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    Arrays.sort(a);
		    long cost[]=new long[n];
		    cost[0]=a[0];
		    for(int i=1;i<n;i++) cost[i]=cost[i-1]+a[i];
		    long ans=0;
		    for(int i=0;i<n;i++){
		        ans+=binsearch(cost[i],i,x);
		    }
		    System.out.println(ans);
		}
	}
}
 
 