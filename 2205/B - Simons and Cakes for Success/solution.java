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
			int temp=n;
			int k=1;
			for(int p=2; p*p<=temp; p++)
			{
			    if(temp%p==0)
			    {
			        k*=p;          
			        while(temp % p==0) temp /= p;
			    }
			}
			if(temp>1) k*=temp;
			System.out.println(k);
		}
	}
}