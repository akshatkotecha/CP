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
	       long p=sc.nextLong();
	       long a[][]=new long[n][2];
 
	       for(int i=0;i<2;i++) 
	       {
	           for(int j=0;j<n;j++) 
	           {
	               a[j][i]=sc.nextLong();
	           }
	       }
 
	       Arrays.sort(a,(b,c)->Long.compare(b[1],c[1]));
 
	       long c=p;
	       n-=1;
	       int i=0;
 
	       while(n>0 && i<a.length)
	       {
	           if(a[i][1]<p)
	           {
	               long q=Math.min(a[i][0],n);
	               c+=q*a[i][1];
	               n-=q;
	           }
	           else {
	               break;
	           }
	           i++;
	       }
 
	       if(n>0) c+= (long)n*p;
 
	       System.out.println(c);
	   }
	}
}