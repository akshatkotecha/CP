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
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++) max=Math.max(max,a[i]);
		    List<Integer> b=new ArrayList<>();
		    List<Integer> c=new ArrayList<>();
		    for(int num : a){
		        if(num!=max) b.add(num);
		        else c.add(num);
		    }
		    if(b.size()==0) System.out.println(-1);
		    else{
		        System.out.println(b.size()+" "+c.size());
		        for(int num : b) System.out.print(num+" ");
		        System.out.println();
		        for(int num : c) System.out.print(num+" ");
		        System.out.println();
		    }
		    
		}
	}
}
 
 