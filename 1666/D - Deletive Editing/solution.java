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
			String s2=sc.next();
			int a[]=new int[26];
			for(int i=0;i<s2.length();i++) a[s2.charAt(i)-'A']++;
			int n=s.length();
			StringBuilder sb=new StringBuilder();
			for(int i=n-1;i>=0;i--){
			    char ch=s.charAt(i);
			    if(a[ch-'A']>0){
			        a[ch-'A']--;
			        sb.append(ch);
			    }
			}
			sb.reverse();
			String str=sb.toString();
			if(s2.equals(str)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
 
 