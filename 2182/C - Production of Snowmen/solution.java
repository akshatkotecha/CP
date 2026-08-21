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
	       int a[]=new int[n];
	       int b[]=new int[n];
	       int c[]=new int[n];
	       for(int i=0;i<n;i++) a[i]=sc.nextInt();
	       for(int i=0;i<n;i++) b[i]=sc.nextInt();
	       for(int i=0;i<n;i++) c[i]=sc.nextInt();
	     //  long ans=0;
	       long c1=0;
	       for(int i=0;i<n;i++){
	           boolean ok=true;
	           for(int j=0;j<n;j++)
	           {
	               if(a[j]>=b[(i+j)%n]){
	                   ok=false;
	                   break;
	               }
	           }
	           if(ok) c1++;
	       }
	       long c2=0;
	       for(int i=0;i<n;i++){
	           boolean ok=true;
	           for(int j=0;j<n;j++)
	           {
	               if(b[j]>=c[(i+j)%n]){
	                   ok=false;
	                   break;
	               }
	           }
	           if(ok) c2++;
	       }
	       long ans=(long)n*c1*c2;
	       System.out.println(ans);
	   }
 
	}
}