import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int lenA = a.length();
        int lenB = b.length();   
        int countA = 0;
        int countB = 0;     
        
        if (lenA != lenB){
            return false;
        }
        
        for (int i = 0; i < lenA; i++){
            for (int j = 0; j < lenB; j++){
                if (a.toLowerCase().charAt(i) == a.toLowerCase().charAt(j)){
                    countA++;
                }
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)){
                    countB++;
                }
            } 
            if (countA != countB){
                return false;
            }          
        }
        

        // if (b.compareToIgnoreCase(a) != 0){ 
        //     return false;       
        // }
        // else{
        //     return true;
        // }
        
        
        return true; 
    }

  public static void main(String[] args) {