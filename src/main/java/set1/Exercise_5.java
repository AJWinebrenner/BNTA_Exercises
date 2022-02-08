package set1;

public class Exercise_5 {
    public static void main(String[] args) {
        // takes program args and prints
        StringBuilder argList = new StringBuilder();
        argList.append("Your inputs: ");
        for (String arg : args) {
            argList.append(arg).append(" ");
        }
        System.out.println(argList);
    }
}