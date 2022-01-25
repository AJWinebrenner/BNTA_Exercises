package set2;

import java.util.Arrays;

public class Exercise_7 {

    public static void main(String[] args) {
        try {
            System.out.println("The longest Strings are " + Arrays.toString(longestStrings(args)));
        } catch (Exception e) {
            System.out.println("please parse arguments");
        }
    }

    static String[] longestStrings(String[] strings){
        int longnum = 0;
        String longest = "";
        for (String string : strings) {
            if (string.length() == longnum) {
                longest += (string + ",");
            } else if (string.length() > longnum) {
                longest = "";
                longest += (string + ",");
                longnum = string.length();
            }
        }
        return longest.substring(0,longest.length()-1).split(",");
    }
}