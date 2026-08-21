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
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
 
			int a[] = new int[n];
 
			HashMap<Integer,Integer> mp = new HashMap<>();
 
			for(int i = 0; i < n; i++)
			{
				a[i] = sc.nextInt();
 
				mp.put(a[i], mp.getOrDefault(a[i],0)+1);
			}
 
			ArrayList<Integer> nums = new ArrayList<>(mp.keySet());
 
			Collections.sort(nums);
 
			boolean ok = false;
 
			while(nums.size() > 0)
			{
				int m = nums.size();
 
				int last = nums.get(m-1);
 
				int freq = mp.get(last);
 
				// Even frequency
				if(freq % 2 == 0)
				{
					ok = true;
					break;
				}
 
				// Only one distinct number left
				if(m == 1)
				{
					break;
				}
 
				int prev = nums.get(m-2);
 
				// Connected to previous block
				if(last - prev <= k)
				{
					ok = true;
					break;
				}
 
				// Discard largest block
				nums.remove(m-1);
			}
 
			if(ok)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}