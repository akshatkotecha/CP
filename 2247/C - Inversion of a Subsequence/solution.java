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
			int b[]=new int[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextInt();
	        for(int i=0;i<n;i++) b[i]=sc.nextInt();
	        int z1=0;
	        int o1=0;
	        int z2=0;
	        int o2=0;
	        for(int i=0;i<n;i++){
	            if(a[i]==1) o1++;
	            else z1++;
	        }
	        for(int i=0;i<n;i++){
	            if(b[i]==1) o2++;
	            else z2++;
	        }
	        if(Arrays.equals(a,b)) System.out.println(0);
	        else if((o1==0) || (z2==0)) System.out.println(-1);
	        else{
	            int sum=0;
	            for(int i=0;i<n;i++){
	                if(a[i]!=b[i]){
	                    sum+=a[i];
	                }
	            } 
	            if(sum%2==1) System.out.println(1);
	            else System.out.println(2);
	        }
	       
		}
	}
}
 
 