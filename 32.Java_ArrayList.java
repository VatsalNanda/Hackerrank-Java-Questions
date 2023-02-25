import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();// integer n
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> arr2=new ArrayList<>();
            int val1=scan.nextInt();// integer d
            arr2.add(val1);
            for(int j=0;j<val1;j++)
            {
                int val2=scan.nextInt();
                arr2.add(val2);
            }
            arr1.add(arr2);
            
            
        }
        int n1=scan.nextInt();//number of queries
        for(int i=0;i<n1;i++)
        {
            int x=scan.nextInt();//val x
            int y=scan.nextInt();//val y
            
            try{
                System.out.println(arr1.get(x-1).get(y));
            } catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}