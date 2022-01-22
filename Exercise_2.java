import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        // setup user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Checking if two strings are equal \n");
        // get user input
        System.out.println("Enter first string");
        String x = scanner.nextLine();
        System.out.println("Enter second string");
        String y = scanner.nextLine();
        // check result
        boolean isSame = x.contentEquals(y);

        System.out.println("Are strings the same? " + isSame);
    }
}
