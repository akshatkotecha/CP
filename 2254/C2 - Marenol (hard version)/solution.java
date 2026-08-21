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
			String s1=sc.next();
			String s2=sc.next();
			List<Integer> evena =new ArrayList<>();
			List<Integer> odda =new ArrayList<>();
			List<Integer> evenb =new ArrayList<>();
			List<Integer> oddb =new ArrayList<>();
			
			for(int i=0;i<n;i++){
			    char ch1=s1.charAt(i);
			    char ch2=s2.charAt(i);
			    
			    if(ch1=='1' && i%2==0) evena.add(i);
			    if(ch1=='1' && i%2==1) odda.add(i);
			    if(ch2=='1' && i%2==0) evenb.add(i);
			    if(ch2=='1' && i%2==1) oddb.add(i);
			    
			}
			if(evena.size() != evenb.size() || odda.size() != oddb.size()){
			    System.out.println(-1);
			    continue;
			}
			long ans=0;
			for(int i=0;i<evena.size();i++){
			    ans+=(long)Math.abs(evena.get(i)-evenb.get(i))/2;
			}
			for(int i=0;i<odda.size();i++){
			    ans+=(long)Math.abs(oddb.get(i)-odda.get(i))/2;
			}
			System.out.println(ans);
			
		}
	}
}
 
 