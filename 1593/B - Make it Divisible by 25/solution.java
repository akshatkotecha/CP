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
	public static int minoperations(String s,String str){
	    int o=0;
	    int check=1;
	    for(int i=s.length()-1;i>=0;i--){
	        if(s.charAt(i)==str.charAt(check)){
	            check--;
	            if(check<0) break;
	        }
	        else o++;
	    }
	    if(check>=0) o=Integer.MAX_VALUE;
	    return o;
	    
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			List<String> list=Arrays.asList("00", "25", "50", "75");
			int ans=Integer.MAX_VALUE;
			for(String str : list){
			    ans=Math.min(ans,minoperations(s,str));
			}
	        System.out.println(ans);
		}   
	}
}
 
 