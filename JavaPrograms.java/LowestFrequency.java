//75. Write a JAVAprogram to find lowest frequency character in a string.

import java.util.Scanner;

public class LowestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        char minChar = str.charAt(0);
        int minFreq = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            if (freq[ch] < minFreq) {
                minChar = ch;
                minFreq = freq[ch];
            }
        }
        System.out.println("The lowest frequency character in the string is " + minChar);
    }
}