import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // 1. Push the corresponding closing bracket when you see an opening bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } 
            // 2. If it's a closing bracket, check if the stack is empty 
            // or if it doesn't match the expected closing bracket
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // 3. If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
