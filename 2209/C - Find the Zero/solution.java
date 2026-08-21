import java.util.*;
import java.lang.*;
import java.io.*;
 
public class CodeChef{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=-1;
            for (int i=3;i<=2*n;i+=2){
                System.out.println("? "+ i +" " +(i + 1));
                System.out.flush();
                int r=sc.nextInt();
                if(r==-1) return;
                if(r==1){
                    ans=i;
                    break;
                }
            }
            if(ans==-1) 
            { 
                System.out.println("? 1 3");
                System.out.flush();
                int r1=sc.nextInt();
                System.out.println("? 1 4");
                System.out.flush();
                int r2=sc.nextInt();
                if(r1==1 || r2==1) ans=1;
                else ans=2;
            }
            System.out.println("! "+ans);
            System.out.flush();
        }
    }
}