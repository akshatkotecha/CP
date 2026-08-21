import java.util.*;
import java.io.*;
 
public class Codechef {
 
    // -------- CONSTANTS --------
    static final long MOD = 1000000007L;
    static final int MAXN = 2000000;
    static final long INF = 1_000_000_000L;
    static Map<Long, Long> memo = new HashMap<>();
 
    // -------- MAIN --------
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
	       long n=sc.nextLong();
	       long k=sc.nextLong();
	       memo.clear();
	       long result=solve(n,k);
	       if(result>=INF) System.out.println(-1);
	       else System.out.println(result);
 
                   }
 
        sc.close();
    }
 
    // -------- MATH FUNCTIONS --------
 
    static long gcd(long a, long b) {
        while (b != 0) {
            a %= b;
            long temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
 
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
 
    static long binpow(long a, long b, long m) {
        long res = 1 % m;
        a %= m;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }
 
    static long modinv(long a, long m) {
        return binpow((a % m + m) % m, m - 2, m);
    }
 
    // -------- FACTORIAL & NCR --------
    static long[] fact, invFact;
 
    static void precomputeFactorials(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = 1;
 
        for (int i = 1; i <= n; i++)
            fact[i] = (fact[i - 1] * i) % MOD;
 
        invFact[n] = modinv(fact[n], MOD);
        for (int i = n - 1; i >= 0; i--)
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
    }
 
    static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (((fact[n] * invFact[r]) % MOD) * invFact[n - r]) % MOD;
    }
 
    static long nPr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (fact[n] * invFact[n - r]) % MOD;
    }
 
    // -------- SIEVE --------
    static boolean[] isPrime = new boolean[MAXN + 1];
    static List<Integer> primes = new ArrayList<>();
 
    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
 
        for (int i = 2; i * i <= MAXN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAXN; j += i)
                    isPrime[j] = false;
            }
        }
 
        for (int i = 2; i <= MAXN; i++)
            if (isPrime[i]) primes.add(i);
    }
 
    // -------- SPF --------
    static int[] spf = new int[MAXN + 1];
 
    static void sieveSPF() {
        for (int i = 1; i <= MAXN; i++)
            spf[i] = i;
 
        for (int i = 2; i * i <= MAXN; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAXN; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }
 
    static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int prev = -1;
        while (n != 1) {
            int p = spf[n];
            if (p != prev) factors.add(p);
            prev = p;
            n /= p;
        }
        return factors;
    }
 
    // -------- FACTORS OF NUMBER --------
    static List<Long> factors(long n) {
        List<Long> f = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                f.add(i);
                if (i != n / i) f.add(n / i);
            }
        }
        return f;
    }
 
    // -------- GRAPH BFS --------
    static void bfs(boolean[] visited, int start, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
 
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }
 
    // -------- GRAPH DFS --------
    static void dfs(boolean[] visited, int node, List<List<Integer>> adj) {
        visited[node] = true;
        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(visited, neigh, adj);
            }
        }
    }
 
    // -------- MEX --------
    static long mex(List<Long> v) {
        HashSet<Long> set = new HashSet<>(v);
        long m = 0;
        while (set.contains(m)) m++;
        return m;
    }
 
    // -------- PALINDROME --------
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
 
 
static long solve(long n,long k)
	{
	     if(n==k) return 0;
	     if(n<k)  return INF;
	     if(memo.containsKey(n)) return memo.get(n);
	     long left=n/2;
	     long right=(n+1)/2;
	     long ans=1+Math.min(solve(left,k),solve(right,k));
	     memo.put(n,ans);
	     return ans;
	}
 
    // -------- TREE NODES --------
    static class Node {
        long data;
        Node left, right;
        Node(long val) {
            data = val;
            left = right = null;
        }
    }
 
    static class TreeNode {
        long val;
        TreeNode left, right;
        TreeNode(long x) {
            val = x;
            left = right = null;
        }
    }
}