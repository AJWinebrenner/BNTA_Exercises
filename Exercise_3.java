public class Exercise_3 {
    public static void main(String[] args) {
        // reversing string entries
        String[] content = {"you", "are", "how", "hello"};
        StringBuilder reverse = new StringBuilder();
        for (int i = content.length-1; i >= 0; i--) {
            reverse.append(content[i]).append(" ");
        }
        System.out.println(reverse + "?");
    }
}
