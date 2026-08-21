import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int d=sc.nextInt();
			int c=(d/m)+1;
			System.out.println((n+c-1)/c);
			
		}
	}
}