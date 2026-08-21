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
			boolean flag =false;
			for(int i=0;i<n;i++)
			{
			    int j=-1;
			    int k=-1;
			    for(int left=0;left<i;left++)
			    {
			        if(a[left]<a[i])
			        {
			            j=left;
			            break;
			        }
			    }
			    for(int right=i+1;right<n;right++)
			    {
			        if(a[right]<a[i]){
			            k=right;
			            break;
			        }
			    }
			    if(j!=-1 && k!=-1)
			    {
			        System.out.println("YES");
			        System.out.println((j + 1) + " " + (i + 1) + " " + (k + 1));
			        flag=true;
			        break;
			    }
			}
			if(!flag) System.out.println("NO");
			
		}
	}
}
 
 