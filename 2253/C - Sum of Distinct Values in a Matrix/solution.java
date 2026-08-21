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
 
	public static long solve(int[] arr, int[] arr2, int t1, int t2)
	{
		int p1 = arr.length - 1;
		int p2 = arr2.length - 1;
		int d = t1 + t2;
		long sum = 0;
		while (p1 >= 1 && p2 >= 1 && t1 > 0 && t2 > 0 && d > 0)
		{
			if (arr[p1] > arr2[p2])
			{
				sum += arr[p1];
				p1--;
				t1--;
			}
			else if (arr2[p2] > arr[p1])
			{
				sum += arr2[p2];
				p2--;
				t2--;
			}
			else
			{
				sum += arr[p1];
				p1--;
				p2--;
			}
 
			d--;
		}
 
		while (d > 0 && p1 >= 1 && t1 > 0)
		{
			sum += arr[p1];
			p1--;
			t1--;
			d--;
		}
 
		while (d > 0 && p2 >= 1 && t2 > 0)
		{
			sum += arr2[p2];
			p2--;
			t2--;
			d--;
		}
 
		return sum;
	}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
 
		int t= sc.nextInt();
 
		while (t-->0)
		{
			int n, m, x, y;
			n = sc.nextInt();
			m = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
 
			int[] arr = new int[x + 1];
			int[] arr2 = new int[y + 1];
 
			for (int i = 1; i <= x; i++)
				arr[i] = sc.nextInt();
 
			for (int i = 1; i <= y; i++)
				arr2[i] = sc.nextInt();
 
			long ans = 0;
 
			int t1 = Math.min(n, x);
			int t2 = Math.min(m - 1, y);
			ans = Math.max(ans, solve(arr, arr2, t1, t2));
			t1 = Math.min(n - 1, x);
			t2 = Math.min(m, y);
			ans = Math.max(ans, solve(arr, arr2, t1, t2));
			System.out.println(ans);
		}
	}
}