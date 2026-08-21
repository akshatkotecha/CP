import java.util.*;
import java.lang.*;
import java.io.*;
 
public class A_Dungeon_Equilibrium
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       int a[]=new int[n];
           int b[]=new int[101];
           Arrays.fill(b,0);
	       for(int i=0;i<n; i++)    a[i]=sc.nextInt();
           for(int i=0;i<n;i++) b[a[i]]++;
           int sum=0;
           for(int i=0;i<101;i++)
           {
            if(b[i]<i) sum+=b[i];
            else sum+=b[i]-i;
           }
	       System.out.println(sum);;
	   }
 
	}
}