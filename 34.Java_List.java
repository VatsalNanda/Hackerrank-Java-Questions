import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            int val=scan.nextInt();
            arr.add(val);
        }
        int q=scan.nextInt();
        for(int i=0;i<2*q;i++)
        {
            String s=scan.nextLine();
            if(s.equals("Insert"))
            {
                int x=scan.nextInt();
                int y=scan.nextInt();
                arr.add(x, y);
            }
            else if(s.equals("Delete"))
            {
                int x=scan.nextInt();
                arr.remove(x);
            }
        }
        
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
    }
}