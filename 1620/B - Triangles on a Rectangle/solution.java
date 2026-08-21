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
		    long area=Long.MIN_VALUE;
			int w=sc.nextInt();
			int h=sc.nextInt();
			for(int i=0;i<4;i++)
			{
			    int last=0;
			    int first=0;
			    int k=sc.nextInt();
			    for(int j=0;j<k;j++){
			        int l=sc.nextInt();
			        if(j==0) first=l;
			        if(j==k-1) last=l;
			    }
			    int height;
			    int base=last-first;
			    if(i<=1) height=h;
			    else height=w;
			    area=Math.max(area,1L*height*base);
			    
			}
			System.out.println(area);
		}
	}
}
 
 