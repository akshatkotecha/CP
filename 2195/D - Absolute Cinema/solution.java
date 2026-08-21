import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	      // int k=sc.nextInt();
	       long a[]=new long[n+1];
	       for(int i=1;i<=n; i++)  a[i]=sc.nextLong();
	       long b[]=new long[n+1];
	       long sum=0;
	       if(n==2){
	           System.out.println(a[2]+" "+a[1]);
	           continue;
	       }
	       for(int i=2;i<=n-1;i++)
	       {
	           b[i]=(a[i-1]+a[i+1]-2*a[i])/2;
	           sum+=b[i];
	       }
	       long s=0;
	       for(int i=2;i<=n-1;i++) s+=b[i]*(i-1);
	       b[n]=((a[1]-s)/(n-1));
	       long s2=0;
	       for(int i=2;i<=n-1;i++) s2+=b[i]*(n-i);
	       b[1]=((a[n]-s2)/(n-1));
	       for(int i=1;i<=n;i++)
	       {
	           System.out.print(b[i]+" ");
	       }
	       
	       System.out.println();
	   }
 
	}
}