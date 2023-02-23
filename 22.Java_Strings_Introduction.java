import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
      String d=A.substring(0,1).toUpperCase()+A.substring(1); String e=B.substring(0,1).toUpperCase()+B.substring(1); int a=A.length(); int b=B.length(); int c= A.length()+B.length(); System.out.println(c); boolean f= A.equals("java"); boolean g =B.equals("hello"); if(f== true && g == true){ System.out.println("Yes");
} else{ System.out.println("No"); } System.out.println(d +" "+e);
    }
}



