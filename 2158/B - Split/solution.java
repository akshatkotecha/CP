import java.util.*;
import java.io.*;
 
public class Codechef
{
    static class FastReader
    {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        private int read() throws IOException
        {
            if (ptr >= len)
            {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException
        {
            int c;
            while ((c = read()) <= ' ')
            {
                if (c == -1) return -1;
            }
 
            int sign = 1;
            if (c == '-')
            {
                sign = -1;
                c = read();
            }
 
            int val = 0;
            while (c > ' ')
            {
                val = val * 10 + (c - '0');
                c = read();
            }
 
            return val * sign;
        }
    }
 
    public static void main(String[] args) throws Exception
    {
        FastReader sc = new FastReader();
        StringBuilder sb = new StringBuilder();
 
        int t = sc.nextInt();
 
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] freq = new int[2 * n + 1];
 
            for (int i = 0; i < 2 * n; i++)
            {
                int x = sc.nextInt();
                freq[x]++;
            }
 
            int ans = 0;
            int c = 0;
            int o = 0;
 
            for (int i = 1; i <= 2 * n; i++)
            {
                if (freq[i] == 0) continue;
 
                if (freq[i] % 4 == 0)
                {
                    c++;
                }
 
                if (freq[i] % 2 == 0)
                {
                    ans += 2;
                }
                else
                {
                    o++;
                    ans++;
                }
            }
 
            if (c % 2 == 1 && o < 2)
            {
                ans -= 2;
            }
 
            sb.append(ans).append('
');
        }
 
        System.out.print(sb);
    }
}