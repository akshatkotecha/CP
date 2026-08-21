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
			int ans=Integer.MAX_VALUE;
			for(int i=0;i<32;i++){
			    int min=0;
			    int copy=b+i;
			    if(copy==1) continue;
			    int newa=a;
			    while(newa>0){
			        newa=newa/copy;
			        min++;
			    }
			    min+=i;
			    ans=Math.min(min,ans);
			}
			System.out.println(ans);
		}
	}
}
 
 