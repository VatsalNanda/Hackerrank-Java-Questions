import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
        } catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
        sc.close();
    
    }
}