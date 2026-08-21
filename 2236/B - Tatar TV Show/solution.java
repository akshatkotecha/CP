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
			int k=sc.nextInt();
			boolean ok=true;
			String s=sc.next();
			int c=0;
			for(int i=0;i<k;i++){
			    c=0;
			    for(int j=i;j<n;j+=k){
			        if(s.charAt(j)=='1') c++;
			    }
			    if(c%2==1) ok=false;
			}
			if(ok) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
 
 