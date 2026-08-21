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
    		return (a + b) / gcd(a, b);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			HashMap<Integer,Integer> map=new HashMap<>();
			List<List<Integer>> list=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
			    int k=sc.nextInt();
			    List<Integer> list1=new ArrayList<>();
			    for(int j=0;j<k;j++)
			    {
			        int v=sc.nextInt();
			        list1.add(v);
			        map.put(v,map.getOrDefault(v,0)+1);
			    }
			    list.add(list1);
			}
	        int s=map.keySet().size();
	        if(s<m) {System.out.println("NO"); continue;}
	        int ans=1;
	        for(int i=0;i<n;i++)
	        {
	            List<Integer> li=new ArrayList<>(list.get(i));
	            int q=li.size();
	            boolean ok=true;
	            for(int j=0;j<q;j++)
	            {
	                int o=li.get(j);
	                if(map.containsKey(o)) 
	                {
	                    map.put(o,map.get(o)-1);
	                }
	                if(map.get(o)<=0) ok=false;
	            }
	            if(ok) ans++;
	            for(int j=0;j<q;j++)
	            {
	                int o=li.get(j);
	                map.put(o,map.getOrDefault(o,0)+1);
	            }
	            if(ans==3) break;
	        }
	        if(ans==3) System.out.println("YES");
	        else System.out.println("NO");
		}
	}
}
 
 