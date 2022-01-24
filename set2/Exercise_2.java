package set2;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        input = input.trim();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (input.charAt(i) == 'b') {
                    output.append(Character.toUpperCase(input.charAt(i)));
                    continue;
                }
                if (input.charAt(i) == 'n') {
                    output.append(' ').append(Character.toUpperCase(input.charAt(i)));
                    continue;
                }
                output.append(input.charAt(i));
            }

        }

        System.out.println(output);
    }
}
