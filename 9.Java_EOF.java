import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int cnt=1;
        while(sc.hasNext())
        {
            
          
            System.out.println(cnt+" "+sc.nextLine());
            cnt++;
        }
        
        sc.close();
    }
}
