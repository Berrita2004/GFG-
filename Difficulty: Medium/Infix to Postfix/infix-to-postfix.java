import java.util.Stack;

class Solution {
    public static int priority(char c){
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }
    // hard , this has to be hard
    public static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                    
                }
            }
            else { // operator
                while (!stack.isEmpty() && 
                      ((c != '^' && priority(c) <= priority(stack.peek())) || 
                       (c == '^' && priority(c) < priority(stack.peek())))) {
                    ans.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        
        return ans.toString();
    }
}
