import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++)
        {
            int val=scan.nextInt();
            a[i]=val;
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int sum=a[i];
            if(sum<0)
            cnt++;
            for(int j=i+1;j<n;j++)
            {
                sum+=a[j];
                if(sum<0)
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}