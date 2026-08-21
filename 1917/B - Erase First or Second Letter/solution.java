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
			String s=sc.next();
			Map<Character,Integer> freq=new HashMap<>();
			int a[]=new int[n];
			int count=0;
			int sum=0;
			for(int i=0;i<n;i++)
			{
			    char b=s.charAt(i);
			    freq.put(b,freq.getOrDefault(b,0)+1);
			    if(freq.get(b)==1) count++;
			    a[i]=count;
			}
			for(int i : a) sum+=i;
			System.out.println(sum);
		}
	}
}
 
 