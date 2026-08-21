import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<Long> odd=new ArrayList<>();
            List<Long> even=new ArrayList<>();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                long x=sc.nextLong();
                a[i]=x;
                if(x%2==0) even.add(x);
                else odd.add(x);
            }
            Collections.sort(odd);
            Collections.sort(even, Collections.reverseOrder());
            int m=even.size();
            long[] prefEven=new long[m+1];
            for(int i=1;i<=m;i++)
                prefEven[i]=prefEven[i-1]+even.get(i-1);
 
            int odd1=1, even1=0;
            if(odd.size()==0){
                odd1=0;
                even1=1;
            }
            for(int k=1;k<=n;k++){
                if(k>1){
                    if(even1<even.size()) even1++;
                    else{
                        if(odd1+2<=odd.size() && even1>0){
                            odd1+=2;
                            even1--;
                        }
                        else{
                            odd1++;
                        }
                    }
                }
                if((odd1&1)==1){
                    System.out.print(odd.get(odd.size()-1)+prefEven[even1]+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}