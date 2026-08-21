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
			String s1=sc.next();
			String s2=sc.next();
			int dp[][]=new int[n+1][3];
			int max=Integer.MAX_VALUE;
			for(int i=0;i<=n;i++) Arrays.fill(dp[i],max);
			dp[0][0]=0;
			for(int i=0;i<n;i++)
			{
			    char a=s1.charAt(i);
			    char b=s2.charAt(i);
			    int rr=0;
			    int rb=0;
			    int br=0;
			    int bb=0;
			    if(a=='R')
			    {
			        br++;
			        bb++;
			    }
			    if(a=='B')
			    {
			        rr++;
			        rb++;
			    }
			    if(b=='R')
			    {
			        rb++;
			        bb++;
			    }
			    if(b=='B')
			    {
			        rr++;
			        br++;
			    }
			    if(dp[i][0]!=max)
			    {
			        dp[i+1][0]=Math.min(dp[i+1][0],dp[i][0]+rr);
			        dp[i+1][0]=Math.min(dp[i+1][0],dp[i][0]+bb);
			        dp[i+1][1]=Math.min(dp[i+1][1],dp[i][0]+rb);
			        dp[i+1][2]=Math.min(dp[i+1][2],dp[i][0]+br);
			    }
			    if(dp[i][1]!=max) dp[i+1][0]=Math.min(dp[i+1][0],dp[i][1]+rb);
			    if(dp[i][2]!=max) dp[i+1][0]=Math.min(dp[i+1][0],dp[i][2]+br);
			    
			}
			System.out.println(dp[n][0]);
			
		}
	}
}
 
 