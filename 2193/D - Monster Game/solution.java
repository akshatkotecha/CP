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
            int b[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n/2;i++){
                int temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;
            }
            int left=0;
            long ans=0;
            long sum=0;
            for(int i=0;i<n;i++){
                while(left<n && sum+b[left]<=i+1){
                    sum+=b[left];
                    left++;
                }
                ans=Math.max(ans,1L*a[i]*left);
            }
            System.out.println(ans);
		}
	}
}
 
 