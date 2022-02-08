package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {

    public String getMostOccurrences(String string) {
        HashMap<String, Integer> numOfEach = numberOfOccurrences(string);
        String most = null;
        int highest = 0;
        for (Map.Entry<String, Integer> entry : numOfEach.entrySet()) {
            int v = entry.getValue();
            if (v > highest) {
                highest = v;
                most = entry.getKey();
            }
        }
        return most;
    }

    public HashMap<String, Integer> numberOfOccurrences(String string) {
        HashMap<String, Integer> numOfEach = new HashMap<>();
        if (string.matches(".*\\S.*")) {
            String[] strings = string.split(",");
            for (String s : strings) {
                numOfEach.put(s.trim(), numOfEach.getOrDefault(s.trim(), 0) + 1);
            }
        }
        return numOfEach;
    }

}
