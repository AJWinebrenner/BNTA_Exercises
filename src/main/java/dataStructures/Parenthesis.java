package dataStructures;

import java.util.Stack;

public class Parenthesis {

    public String getOnly(String string) {
        string = string.trim().replaceAll("[^\\[\\]}{)(]","");
        return string;
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
                    char check = checker.pop();
                    if (c != check) return false;
                }
            }
        }
        return checker.isEmpty();
    }

}
