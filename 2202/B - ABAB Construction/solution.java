import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextInt()) return;
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			String s = sc.next();
			int L = 0, R = n - 1;
			boolean ok = true;
			for(int i = 0; i < n; i++)
			{
				char c = s.charAt(i);
				char x = (L % 2 == 0) ? 'a' : 'b';
				char y = (R % 2 == 0) ? 'a' : 'b';
				if(c == 'a' || c == 'b')
				{
					if(c == x) L++;
					else if(c == y) R--;
					else { ok = false; break; }
				}
				else
				{
					int j = i + 1;
					while(j < n && s.charAt(j) == '?') j++;
					if(j == n)
					{
						L++;
					}
					else
					{
						char need = s.charAt(j);
						char nx = ((L+1) % 2 == 0) ? 'a' : 'b';
						char ny = (R % 2 == 0) ? 'a' : 'b';
						boolean leftOK = (need == nx || need == ny);
						nx = (L % 2 == 0) ? 'a' : 'b';
						ny = ((R-1) % 2 == 0) ? 'a' : 'b';
						boolean rightOK = (need == nx || need == ny);
						if(leftOK) L++;
						else if(rightOK) R--;
						else { 
						    ok = false; 
						    break; 
						}
					}
				}
			}
 
			System.out.println(ok ? "YES" : "NO");
		}
	}
}