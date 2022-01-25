package set2;

import java.util.Random;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {

        // init joke array
        String[] jokes = {"I invented a new word... Plagiarism.", "Did you hear about the claustrophobic astronaut? He just needed a little space.", "Why don’t scientists trust atoms? Because they make up everything.", "How does Moses make tea? He brews.", "Why can't you explain puns to kleptomaniacs? They always take things literally.", "What does Charles Dickens keep in his spice rack? The best of thymes, the worst of thymes"};

        //interface
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Want to hear a joke? y/n");
            String input = scan.nextLine().toLowerCase();
            if (input.contentEquals("y") || input.contentEquals("yes")) {
                System.out.println(ranString(jokes));
            } else if (input.contentEquals("n") || input.contentEquals("no")) {
                break;
            } else {
                System.out.println("Sorry, I need a definite answer.");
            }
        }
        System.out.println("I guess you're tired of my jokes. See ya!");

    }

    //pick random string from array
    static String ranString(String[] strings) {
        Random ran = new Random();
        return strings[ran.nextInt(strings.length)];
    }
}
