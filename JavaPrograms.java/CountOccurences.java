//73. Write a JAVAprogram to count occurrences of a character in given string.

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static void main(String[] args) {
        String str = "gowrikumar dukka ";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character Count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}