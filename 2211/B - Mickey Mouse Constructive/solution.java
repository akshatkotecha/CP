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
			int x=sc.nextInt();
			int y=sc.nextInt();
			int s=Math.abs(x - y);
			if(s==0)
			{
				System.out.println(1);
			}
			else
			{
				long c=0;
				for(int i=1;i*i<=s;i++)
				{
					if(s%i==0)
					{
						c++;
						if(i*i!=s) c++;
					}
				}
				System.out.println(c);
			}
			if(x>=y)
			{
				for(int i=0;i<x;i++) System.out.print("1 ");
				for(int i=0;i<y;i++) System.out.print("-1 ");
			}
			else
			{
				for(int i=0;i<y;i++) System.out.print("-1 ");
				for(int i=0;i<x;i++) System.out.print("1 ");
			}
			System.out.println();
		}
	}
}