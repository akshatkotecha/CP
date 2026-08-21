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
			int c=sc.nextInt();
		//	int a[]=new int[];
			int a[]=new int[n];
for(int i=0;i<n;i++)
{
    int x=sc.nextInt();
    a[i]=x+i+1;
}
Arrays.sort(a);
 
int i=0;
int ans=0;
 
while(i<n && a[i]<=c)
{
    c-=a[i];
    ans++;
    i++;
}
			System.out.println(ans);
			
		}
	}
}
 
 