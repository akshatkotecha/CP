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
			int a[]=new int[7];
			for(int i=0;i<7;i++) a[i]=sc.nextInt();
			Arrays.sort(a);
			int sum=a[6];
			for(int i=0;i<6;i++) sum+=(-a[i]);
			System.out.println(sum);
			
		}
	}
}
 
 