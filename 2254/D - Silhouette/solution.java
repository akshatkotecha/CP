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
			long a[]=new long[n];
	        for(int i=0;i<n;i++) a[i]=sc.nextLong();
	        Map<Long,Long> map=new HashMap<>();
	        for(long num : a){
	            map.put(num,map.getOrDefault(num,0L)+1);
	        }
	        ArrayList<Long> list=new ArrayList<>(map.keySet());
	        Collections.sort(list);
	        if(list.get(0)!=0){
	            System.out.println(-1);
	            continue;
	        }
	        boolean ok=true;
	        Map<Long,Long> newMap=new HashMap<>();
	        int size=list.size();
	        for(int i=0;i<size-1;i++){
	            long new1=list.get(i);
	            long new2=list.get(i+1);
	            long diff=new2-new1;
	            long fre=map.get(new1);
	            
	            if(diff<=0 || diff%fre!=0) {
	                ok=false;
	                break;
	            }
	            long ans=diff/fre;
	            
	            if(i==0){
	                if(ans<1) {
	                    ok=false;
	                    break;
	                }
	            }
	            else{
	                long h=newMap.get(list.get(i-1));
	                if(ans<=h){
	                    ok=false;
	                    break;
	                }
	            }
	            newMap.put(new1,ans);
	        }
	        if(!ok){
	            System.out.println(-1);
	            continue;
	        }
	        
	        long last=list.get(size-1);
	        
	        for(int i=0;i<n;i++){
	            if(a[i]==last){
	                if(size==1) System.out.print(1);
	                else System.out.print(newMap.get(list.get(size-2))+1);
	            }
	            else{
	                System.out.print(newMap.get(a[i]));
	            }
	             if(i!=n-1) System.out.print(" ");
	        }
	        System.out.println();
	        
		}
	}
}
 
 