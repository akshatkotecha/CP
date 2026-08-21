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
			long n=sc.nextLong();
			if(Long.bitCount(n)!=1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}