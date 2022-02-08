package set2;

import java.util.Scanner;

public class Exercise_1 {

    static String reverseString(String input) {

        StringBuilder rev = new StringBuilder();

        for (int i = input.length()-1; i >= 0; i--) {
            rev.append(input.charAt(i));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(reverseString(scan.nextLine()));
    }
}
