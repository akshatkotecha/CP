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
		//	int a[]=new int[n];
		//	for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    ArrayList<Integer> list=new ArrayList<>();
		    boolean ok=true;
		    for(int i=1;i<=n;i++)
		    {
		        int temp=((l+i-1)/i)*i;
		        if(temp<=r) list.add(temp);
		        else{
		            ok=false;
		            System.out.println("NO");
		            break;
		        }
		    }
		    if(ok)
		    {
		        System.out.println("YES");
		        for(int x : list) System.out.print(x+" ");
		        System.out.println();
		    }
			
		}
	}
}
 
 