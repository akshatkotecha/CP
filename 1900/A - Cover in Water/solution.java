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
		//	int a[]=new int[n];
		//	for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    String s=sc.next();
		    char a[]=s.toCharArray();
		 //   int n=a.length;
		    int c=0;
		    boolean ok=false;
		    for(int i=0;i<n-2;i++)
		    {
		        if(a[i]=='.' && a[i+1]=='.' && a[i+2]=='.')
		        {
		            ok =true;
		        }
		    }
		    for(int i=0;i<n;i++) if(a[i]=='.') c++;
		//    String s1=new String(a);
		    if(ok) System.out.println(2);
		    else System.out.println(c);
		}
	}
}
 
 