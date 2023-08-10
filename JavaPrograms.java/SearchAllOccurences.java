 // 72. Write a JAVAprogram to search all occurrences of a character in given string
  
import java.util.HashMap;
import java.util.Map;

public class SearchAllOccurences {
  public static void main(String[] args) {
    String str = "Java program to search all occurrences of a character in given string";
    Map<Character, Integer> charCountMap = new HashMap<>();
    char[] strArray = str.toCharArray();
    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }
    System.out.println("Occurrence of each character in the given string: ");
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}