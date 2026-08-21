import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
        		{
            int n=sc.nextInt();
            int x=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[m][2];
            for(int i=0;i<m;i++)
            {
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
            }
            int max=x;
            int min=x;
            for(int i=0;i<m;i++)
            {
                int l=a[i][0];
                int r=a[i][1];
                if(r>=min && l<=max){
                max=Math.max(max,a[i][1]);
                min=Math.min(min,a[i][0]);
                }
            }
            System.out.println(max-min+1);
        }
	}
}