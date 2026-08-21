import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static int mex(int l, int r, int a[], int n)
    {
        while(l>=0 && r<a.length && a[l]==a[r])
        {
            l--;
            r++;
        }
        l++;
        r--;
        if(l>r) return 0;
        boolean p[]=new boolean[n+1];
        for(int i=l;i<=r;i++)
        {
            if(a[i]<=n) p[a[i]]=true;
        }
        int m=0;
        while(p[m]) m++;
        return m;
    }
 
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[2*n];
            for(int i=0;i<2*n;i++) a[i]=sc.nextInt();
            int L[]=new int[n];
            int R[]=new int[n];
            Arrays.fill(L,-1);
            for(int i=0;i<2*n;i++)
            {
                if(L[a[i]]==-1) L[a[i]]=i;
                else R[a[i]]=i;
            }
            int ans=0;
            ans=Math.max(ans,mex(L[0],L[0],a,n));
            ans=Math.max(ans,mex(R[0],R[0],a,n));
            int c1=(L[0]+R[0])/2;
            int c2=(L[0]+R[0]+1)/2;
            ans=Math.max(ans,mex(c1,c2,a,n));
            System.out.println(ans);
        }
    }
}