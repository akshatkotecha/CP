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
 
    public static boolean isPrime(int n) { 
		if (n < 2) return false; 
		if (n < 4) return true; 
		if (n % 2 == 0 || n % 3 == 0) return false; 
		
		for (int i = 5; i * i <= n; i += 6){ 
			if (n % i == 0 || n % (i + 2) == 0)   
				return false; 
        } 
		
		return true; 
	} 
 
	public static boolean[] sievePrime(int n) { 
		boolean[] p = new boolean[n + 1]; 
		Arrays.fill(p, true); 
		
		if (n >= 0) p[0] = false; 
		if (n >= 1) p[1] = false; 
		
		for (int i = 2; (int) i * i <= n; i++) 
			if (p[i]) 
				for (int j = i * i; j <= n; j += i) 
					p[j] = false; 
		
		return p; 
	} 
 
	public static void main (String[] args) throws java.lang.Exception 
	{ 
		Scanner sc = new Scanner(System.in); 
		
		int t = sc.nextInt(); 
		
		while(t--> 0) 
		{ 
			int a = sc.nextInt();
			int b = sc.nextInt();
			int xK = sc.nextInt();
			int yK = sc.nextInt();
			int xQ = sc.nextInt();
			int yQ = sc.nextInt();
			int[][] moves = {
				{ a,  b},
				{ a, -b},
				{-a,  b},
				{-a, -b},
				{ b,  a},
				{ b, -a},
				{-b,  a},
				{-b, -a}
			};
			Set<String> king = new HashSet<>();
			Set<String> queen = new HashSet<>();
			for(int i = 0; i < 8; i++)
			{
				int x = xK + moves[i][0];
				int y = yK + moves[i][1];
				king.add(x + "," + y);
			}
			for(int i = 0; i < 8; i++)
			{
				int x = xQ + moves[i][0];
				int y = yQ + moves[i][1];
				queen.add(x + "," + y);
			}
			int answer = 0;
			for(String pos : king)
			{
				if(queen.contains(pos))
					answer++;
			}
			System.out.println(answer);
		} 
	} 
}