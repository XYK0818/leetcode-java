import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack
        for (char c : s.toCharArray()) { // loop through each character in the string
            if (c == '(') // if the character is an opening parenthesis
                stack.push(')'); // push the corresponding closing parenthesis onto the stack
            else if (c == '{') // if the character is an opening brace
                stack.push('}'); // push the corresponding closing brace onto the stack
            else if (c == '[') // if the character is an opening bracket
                stack.push(']'); // push the corresponding closing bracket onto the stack
            else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
                // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
                // does not match the closing bracket, the string is not valid, so return false
                return false;
        }
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }

    public static boolean isValidArrayList(String s) {
        ArrayList<Character> List = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                List.add(')');
            } else if (c == '{') {
                List.add('}');
            } else if (c == '[') {
                List.add(']');
            } else {
                int len = List.size();
                char lastChar = List.get(len-1);
                List.remove(len-1);
                if (List.isEmpty() || lastChar != c){
                    return false;
                }
            }
        }
        return List.isEmpty();
    }
}
