package set2;

public class Email {
    public static boolean validateEmail(String address) {
        return address.contains("@") && address.contains(".");
    }

    public static boolean isEmail(String address) {
        boolean isAt = false;
        boolean isDot = false;
        for (char c : address.toCharArray()) {
            if (c == '@') {
                isAt = true;
            }
            if (isAt) {
                if (c == '.') {
                    isDot = true;
                }
            }
        }
        return (isAt && isDot);
    }
}
