package questions;

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
    static boolean isClosed(char currChar, char popVal) {
        if (currChar == '}' && popVal != '{') {
            return true;
        } else if (currChar == ')' && popVal != '(') {
            return true;
        } else if (currChar == ']' && popVal != '[') {
            return true;
        }
        return false;
    }

    // Complete the isBalanced function below.
    static String balancedParam(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char popVal = stack.pop();
                    if (isClosed(s.charAt(i), popVal)) {
                        return "NO";
                    }
                }
            }
        }

        return stack.empty() ? "YES" : "NO";
    }

    static boolean simplerBalancedString(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
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

        s1 = "([)]";
        s2 = "([])";
        s3 = "((()";
        s4 = "()[]";
        s5 = "(([{}]))[]";

        System.out.println(simplerBalancedString(s1));
        System.out.println(simplerBalancedString(s2));
        System.out.println(simplerBalancedString(s3));
        System.out.println(simplerBalancedString(s4));
        System.out.println(simplerBalancedString(s5));
    }
}