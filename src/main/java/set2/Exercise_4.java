package set2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a whole number (0 to quit)");
            try{
                int num = scan.nextInt();
                if (num != 0) {
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number");
                    } else {
                        System.out.println(num + " is not a prime number");
                    }
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                String bad = scan.next();
                System.out.println(bad + " is not a whole number");
            }
        }
        System.out.println("Goodbye World!");
    }

    static boolean isPrime(int num) {
        int div = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                div++;
            }
            if (div > 1) {
                return false;
            }
        }
        return true;
    }
}
