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
			int c[]=new int[n];
		    for(int i=0;i<n;i++) {
		        a[i]=sc.nextInt();
		        c[i]=a[i];
		    }
		    int b[]=new int[n];
		    for(int i=0;i<n;i++) b[i]=sc.nextInt();
		    Arrays.sort(c);
		    boolean ok=false;
		    for(int i=0;i<n;i++){
		        if(c[i]>b[i]) ok=true;
		    }
		    if(ok) System.out.println(-1);
		    else{
		        boolean used[]=new boolean [n];
		        int ans=0;
		        for(int i=0;i<n;i++){
		            int cnt=0;
		            for(int j=0;j<n;j++){
		                if(!used[j] && a[j]<=b[i]){
		                    used[j]=true;
		                    ans+=cnt;
		                    break;
		                }
		                if(!used[j]) cnt++;
		            }
		            
		        }
		        System.out.println(ans);
		    }
		    
		}
	}
}
 
 