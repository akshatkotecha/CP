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
			if(n<3){
			    if(s1.equals(s2)) System.out.println("YES");
			    else System.out.println("NO");
			    continue;
			}
			int o1=0;
			int o2=0;
			for(char ch : s1.toCharArray()){
			    if(ch=='1') o1++;
			}
			for(char ch : s2.toCharArray()){
			    if(ch=='1') o2++;
			}
			if(o1!=o2){
			    System.out.println("NO");
			    continue;
			}
			
			int evena=0;
			int evenb=0;
			int odda=0;
			int oddb=0;
			for(int i=0;i<n;i++){
			    char ch1=s1.charAt(i);
			    char ch2=s2.charAt(i);
			    if(ch1=='1' && i%2==0) evena++;
			    if(ch1=='1' && i%2==1) odda++;
			    if(ch2=='1' && i%2==0) evenb++;
			    if(ch2=='1' && i%2==1) oddb++;
			}
			if(evena==evenb && odda==oddb) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
 
 