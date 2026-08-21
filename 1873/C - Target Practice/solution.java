import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    private static final int[][] score = {
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
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
			//int n=sc.nextInt();
			char a[][]=new char[10][10];
		    for(int i=0;i<10;i++) {
		        String s=sc.next();
		        for(int j=0;j<10;j++){
		            a[i][j]=s.charAt(j);
		        }
		    }
		    int ans=0;
		    for(int i=0;i<10;i++){
		        for(int j=0;j<10;j++){
		            if(a[i][j]=='X') ans+=score[i][j];
		        }
		    }
		    System.out.println(ans);
		    
		}
	}
}
 
 