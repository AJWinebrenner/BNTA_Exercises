package set2;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an E-mail address");
        System.out.println(Email.isEmail(input.nextLine()));
    }
}
