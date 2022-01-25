package set2;

public class Exercise_3 {
    public static void main(String[] args) {
        for (String arg: args) {
            try {
                int num = Integer.parseInt(arg);
                if (num % 2 == 0) {
                    System.out.println(num + " is even");
                } else {
                    System.out.println(num + " is odd");
                }
            } catch (Exception e) {
                System.out.println(arg + " is not an integer");
            }
        }
    }
}
