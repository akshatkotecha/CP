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
	       long a=sc.nextLong();
	       long b=sc.nextLong();
	       long w=a;
	       long d=b;
	       int cnt1=0;
	       long size=1;
	       while(true)
	       {
	           if(cnt1%2==0)
	           {
	               if(w<size) break;
	               w-=size;
	           }
	           else{
	               if(d<size) break;
	               d-=size;
	           }
	           cnt1++;
	           size<<=1;
	       }
	       w=a;
	       d=b;
	       int cnt2=0;
	       size=1;
	       while(true)
	       {
	           if(cnt2%2==0)
	           {
	               if(d<size) break;
	               d-=size;
	           }
	           else{
	               if(w<size) break;
	               w-=size;
	           }
	           cnt2++;
	           size<<=1;
	       }
	       int q=Math.max(cnt1,cnt2);
	       System.out.println(q);
	   }
 
	}
}