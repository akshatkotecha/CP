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
			int ans=0;
			int count=0;
			
			for(char c : s.toCharArray()){
			    if(c=='#') count++;
			    else{
			        ans=Math.max(ans,(count+1)/2);
			        count=0;
			    }
			}
			System.out.println(Math.max(ans,(count+1)/2));
		}
	}
}
 
 