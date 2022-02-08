package dataStructures;

public class Parenthesis {

    public String getOnly(String string) {
        string = string.trim().replaceAll("[^\\[\\]}{)(]","");
        return string;
    }


}
