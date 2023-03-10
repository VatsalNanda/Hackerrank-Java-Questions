import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
        int m=scan.nextInt();
       
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        
        for(int i=0;i<m;i++)
        {
            String s=scan.next();
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(s.equals("AND"))
            {
                if(a==1&&b==2)
                {
                    b1.and(b2);
                }
                else
                {
                    b2.and(b1);
                }
            }
            else if(s.equals("OR"))
            {
                if(a==1&&b==2)
                {
                    b1.or(b2);
                }
                else
                {
                    b2.or(b1);
                }
            }
            
            else if(s.equals("XOR"))
            {
                if(a==1&&b==2)
                {
                    
                
                b1.xor(b2);
                }
            
            else{
                b2.xor(b1);
            }
        }
        else if(s.equals("SET"))
        {
            if(a==1)
            {
                b1.set(b);
            }
            else 
            {
                b2.set(b);
            }
        }
        
        else if(s.equals("FLIP"))
        {
            if(a==1)
            {
                b1.flip(b);
            }
            else 
            {
                b2.flip(b);
            }
        }
        
        System.out.printf("%s %s\n", b1.cardinality(), b2.cardinality());
        
    }
}
};