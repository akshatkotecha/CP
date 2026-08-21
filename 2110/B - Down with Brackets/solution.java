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
			String s=sc.next();
			int n=s.length();
			boolean ok=true;
			int bal=0;
			for(int i=1;i<n-1;i++)
			{
			    if(s.charAt(i)=='(') bal++;
			    else bal--;
			    if(bal<0) 
			    {
			        ok=false;
			        System.out.println("YES");
			        break;
			    }
 			}
 			 if(!ok) continue;
			    if(bal==0) System.out.println("NO");
			    else  System.out.println("YES"); 
		}
	}
}
 
 