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
			int k=n;
			List<Integer> list=new ArrayList<>();
			for(int i=2;i*i<=n;i++)
			{
			    if(n%i!=0) continue;
			    n/=i;
			    list.add(i);
			    if(list.size()==2) break;
			}
			if(list.size()<2 || list.get(0)==n || list.get(1)==n)
			{
			    System.out.println("NO");
			    continue;
			}
			int g=list.get(0)*list.get(1);
			System.out.println("YES");
			System.out.println(list.get(0) + " "+ list.get(1)+ " "+ k/g);
		}
	}
}