import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int b[]=new int[n];
            int a[]=new int[n+1];
            int c[][]=new int[q][2];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                c[i][0]=sc.nextInt();
                c[i][1]=sc.nextInt();
            }
            int d[]=new int[q];
            int m[]=new int[n+1];
            a[n]=0;
            for(int i=n-1;i>=0;i--) a[i]=Math.max(a[i],Math.max(a[i+1],b[i]));
            int k[]=new int[n+1];
            k[0]=0;
            for(int i=1;i<=n;i++) k[i]=k[i-1]+a[i-1];
            for(int i=0;i<q;i++)
            {
                int g=c[i][0];
                int l=c[i][1];
                d[i]=k[l]-k[g-1];
            }
            for(int i=0;i<q;i++) System.out.print(d[i]+" " );
            System.out.println();
        }
    }
}