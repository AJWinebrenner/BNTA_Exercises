package dataStructures;

import java.util.Stack;

public class Parenthesis {

    public String getOnly(String string) {
        return string.trim().replaceAll("[^\\[\\]}{)(]","");
    }

    public boolean isBalanced(String string) {
        char[] chars = getOnly(string).toCharArray();
        Stack<Character> checker = new Stack<>();
        for (char c : chars) {
            switch (c) {
                case '(' -> checker.push(')');
                case '{' -> checker.push('}');
                case '[' -> checker.push(']');
                default -> {
                    if (checker.isEmpty()) return false;
                    if (c != checker.pop()) return false;
                }
            }
        }
        return checker.isEmpty();
    }

}