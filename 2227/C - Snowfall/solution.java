import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static int gcd(int a, int b) {
        	if (b == 0) return a;
        	return gcd(b, a % b);
    		}
	public static int lcm(int a, int b) {
    		return (a * b) / gcd(a, b);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			List<Integer> list1=new ArrayList<>();
			List<Integer> list2=new ArrayList<>();
			List<Integer> list3=new ArrayList<>();
			List<Integer> list4=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
			    if(a[i]%6==0) list1.add(a[i]);
			   else  if(a[i]%3==0) list3.add(a[i]);
			   else if(a[i]%2==0) list2.add(a[i]);
			   else list4.add(a[i]);
			}
			for(int x : list1) System.out.print(x+" ");
			for(int x : list2) System.out.print(x+" ");
			for(int x : list4) System.out.print(x+" ");
			for(int x : list3) System.out.print(x+" ");
			System.out.println();
		}
	}
}
 
 