import java.io.*;
import java.util.*;
 
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		int t = Integer.parseInt(br.readLine());
 
		while(t-- > 0)
		{
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
 
			int a[][] = new int[n][n];
 
			for(int i = 0; i < n; i++)
			{
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
 
			int c = 0;
 
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(a[i][j] != a[n-i-1][n-j-1]) c++;
				}
			}
 
			c /= 2;
 
			if(c > k) System.out.println("NO");
			else
			{
				int temp = k - c;
 
				if(temp % 2 == 0) System.out.println("YES");
				else
				{
					if(n % 2 == 0) System.out.println("NO");
					else System.out.println("YES");
				}
			}
		}
	}
}