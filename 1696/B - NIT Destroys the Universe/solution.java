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
			int a[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        int c=0;
	        for(int num : a) if(num==0) c++;
	        int left=0;
	        int right=n-1;
	        while(left<n && a[left]==0) left++;
	        while(right>=0 && a[right]==0) right--;
	        boolean ok=false;
	        for(int i=left;i<=right;i++){
	            if(a[i]==0) ok=true;
	        }
	        if(c==n) System.out.println(0);
	        else if(!ok) System.out.println(1);
	        else System.out.println(2);
		}
	}
}
 
 