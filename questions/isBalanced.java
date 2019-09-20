import java.util.*;

public class isBalanced {
    
    public static boolean balancedParam(String param) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < param.length(); i++) {
            Character c = param.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')' && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && stack.peek() == '[')
                stack.pop();
        }

        if (stack.empty())
            return true;
 
        return false;
    }

    public static void main(String[] args) {
        String s1 = "([)]";
        String s2 = "([])";
        String s3 = "((()";
        String s4 = "()[]";
        String s5 = "(([{}]))[]";

        System.out.println(balancedParam(s1));
        System.out.println(balancedParam(s2));
        System.out.println(balancedParam(s3));
        System.out.println(balancedParam(s4));
        System.out.println(balancedParam(s5));
    }
}