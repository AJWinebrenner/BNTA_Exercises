public class AndrewList {

    private String[] strings;

    public AndrewList(int size) {
        strings = new String[size];
    }

    public int getSize() {
        int count = 0;
        for (String s : strings) {
            if (s != null) {
                count++;
            }
        }
        return count;
    }

    public String[] getStrings() {
        return strings;
    }

    public void add(String string) {
        //find an empty spot and assign
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                strings[i] = string;
                return;
            }
        }
        // if no empty spots, increase size and add
        String[] newStrings = new String[strings.length+1];
        //transfer existing to new array
        for (int i = 0; i < strings.length; i++) {
            newStrings[i] = strings[i];
        }
        // add new string
        newStrings[strings.length] = string;
        // assign new String[]
        strings = newStrings;
    }

    public void deleteAtIndex(int index) {
        if (index >= strings.length) {
            throw new IllegalArgumentException("index out of range");
        }
        strings[index] = null;
        // move all higher index values down by 1
        for (int i = index+1; i < strings.length; i++) {
            strings[i-1] = strings[i];
            strings[i] = null;
        }

    }

}
