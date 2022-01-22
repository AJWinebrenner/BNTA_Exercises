import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        // setup user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Checking which number is bigger \n");
        // get user input
        System.out.println("Enter first number");
        float x = scanner.nextFloat();
        System.out.println("Enter second number");
        float y = scanner.nextFloat();
        // check result
        boolean isBigger = (x > y);

        System.out.println("Is first number bigger? " + isBigger);
    }
}
