import java.util.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
 
	   while(t-->0)
	   {
	       int n=sc.nextInt();
 
	       int a[]=new int[n];
	       Integer idx[]=new Integer[n];
 
	       for(int i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	           idx[i]=i;
	       }
 
	       Arrays.sort(idx,(i,j)->a[i]-a[j]);
 
	       long sum=0;
 
	       int b[]=new int[n+1];
	       int p=1;
 
	       for(int k=n-1;k>=0;k--)
	       {
	           int i=idx[k];
 
	           int d = (n-k+1)/2;
 
	           if((n-k)%2==1) b[i+1] =  d;
	           else           b[i+1] = -d;
 
	           sum += 2L * d * a[i];
	       }
 
	       System.out.println(sum);
 
	       for(int i=0;i<=n;i++)
	           System.out.print(b[i] + " ");
	       System.out.println();
	   }
	}
}