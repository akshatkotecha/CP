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
			StringBuilder sb=new StringBuilder();
			if(n%2==0)
			{
			    for(int i=0;i<n;i+=2)
			    {
			        sb.append(i+1).append(" ").append(i+2).append(" ").append(i+2).append(" ").append(i+1).append(" ");
			        sb.append(i+2).append(" ").append(i+1).append(" ").append(i+1).append(" ").append(i+2).append(" ");
			    }
			}
			else{
			    sb.append("3 3 2 1 1 2 1 2 2 3 1 3 ");
			    for(int i=3;i<n;i+=2)
			    {
			        sb.append(i+1).append(" ").append(i+2).append(" ").append(i+2).append(" ").append(i+1).append(" ");
			        sb.append(i+2).append(" ").append(i+1).append(" ").append(i+1).append(" ").append(i+2).append(" ");
			    }
			}
			System.out.println(sb.toString());
		}
	}
}
 
 