import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isValid(input));
            
            
        }
        
    }
    
    public static boolean isValid(String input){
        Map<Character, Character> symbols = new HashMap<>();
        symbols.put('}', '{' );
        symbols.put(')', '(' );
        symbols.put(']', '[' );
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!symbols.containsKey(ch)){
                stack.push(ch);
            } else {
                char top = stack.isEmpty() ? 'i' : stack.pop();
                if (symbols.get(ch) != top){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}