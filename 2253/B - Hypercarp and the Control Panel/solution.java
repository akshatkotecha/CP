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
	        List<Integer> list=new ArrayList<>();
	        int c=1;
	        List<Integer> list1=new ArrayList<>();
	        for(int i=1;i<n;i++){
	            if(a[i]!=a[i-1]){
	                list.add(c);
	                list1.add(a[i-1]);
	                c=1;
	            }
	            else c++;
	        }
	        list.add(c);
	        list1.add(a[n-1]);
	        int ans=list.size();
	        int add=0;
	        for(int i=0;i<list.size();i++){
	            if(list.get(i)<2) continue; 
	            if(i+1<list.size() && list.get(i+1)>=2) add=2;
	            boolean ok1=((i+1<list.size()) &&(i+2>=list.size() || list1.get(i+2)!=list1.get(i)));
	            boolean ok2=((i>0) && (i<2 ||list1.get(i-2)!=list1.get(i)));
	            if(ok1 || ok2) add=Math.max(add,1);
	        }
	        System.out.println(ans+add);
		}
		
	}
}
 
 