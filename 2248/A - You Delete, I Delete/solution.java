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
			String s=sc.next();
			StringBuilder sb=new StringBuilder();
	        boolean ok0=false;
	        boolean ok1=false;
	        for(int i=0;i<s.length();i++){
	            if(!ok0 && s.charAt(i)=='0'){
	                ok0=true;
	                continue;
	            }
	            if(!ok1 && s.charAt(i)=='1'){
	                ok1=true;
	                continue;
	            }
	            sb.append(s.charAt(i));
	        }
	        System.out.println(sb.toString());
	        
		}
	}
}
 
 