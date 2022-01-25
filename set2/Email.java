package set2;

public class Email {
    public static boolean validateEmail(String address) {
        return (address.matches("^[\\w!#$%&'*+\\-/=?^_`{|}~]+(?:\\.[\\w!#$%&'*+\\-/=?^_`{|}~]+)*[@](?:[\\w-]+\\.)+[a-zA-Z]{2,}$"));
    }

   /* public static boolean isEmail(String address) {
        boolean isAt = false;
        boolean isDot = false;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '@') {
                isAt = true;
            }
            if (isAt) {
                if (address.charAt(i) == '.' && i < address.length()-1){
                    isDot = true;
                }
            }
        }
        return (isAt && isDot);
    }*/
}
