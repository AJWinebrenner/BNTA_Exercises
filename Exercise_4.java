public class Exercise_4 {
    public static void main(String[] args) {
        // adding up numbers in a string
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] inputSplit = input.split(",");
        for (String s : inputSplit) {
            result += Double.parseDouble(s);
        }
        System.out.println(result);
    }
}
