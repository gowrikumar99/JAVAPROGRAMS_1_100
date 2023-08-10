
//74. Write a JAVAprogram to find highest frequency character in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindHighistCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("The Maximum Occurring Character: " + maxChar);
    }
}