import java.util.*;

/*
Given a string containing just the
characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
*/
public class IsBalanced {
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