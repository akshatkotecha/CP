import java.util.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws Exception
	{
	   Scanner sc=new Scanner(System.in);
 
	   int n=sc.nextInt();
	   int q=sc.nextInt();
 
	   long a[]=new long[n];
	   int lastUpdate[]=new int[n];
 
	   long sum=0;
 
	   for(int i=0;i<n;i++)
	   {
	       a[i]=sc.nextLong();
	       sum+=a[i];
	   }
 
	   long lastAllValue=0;
	   int lastAllTime=0;
	   int time=0;
 
	   while(q-->0)
	   {
	       int type=sc.nextInt();
	       time++;
 
	       if(type==1)
	       {
	           int i=sc.nextInt()-1;
	           long x=sc.nextLong();
 
	           long old;
 
	           // KEY CONDITION
	           if(lastUpdate[i] < lastAllTime)
	               old = lastAllValue;
	           else
	               old = a[i];
 
	           sum += x - old;
 
	           a[i] = x;
	           lastUpdate[i] = time;
 
	           System.out.println(sum);
	       }
	       else
	       {
	           long x=sc.nextLong();
 
	           lastAllValue = x;
	           lastAllTime = time;
 
	           sum = x * n;
 
	           System.out.println(sum);
	       }
	   }
	}
}