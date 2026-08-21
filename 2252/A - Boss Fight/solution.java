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
			int sum=0;
	        for(int i=0;i<n;i++) {
	            a[i]=sc.nextInt();
	            sum+=a[i];
	        }
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int num : a) map.put(num,map.getOrDefault(num,0)+1);
	        int max=0;
	        int number=0;
	        for(int num : map.keySet()){
	            if(map.get(num)>max){
	                max=map.get(num);
	                number=num;
	            }
	        }
	        int sum1=sum-(max*number);
	        int total=n-max;
	        System.out.println(sum1+number*Math.min(max,total+2));
	        
	        
		}
	}
}
 
 