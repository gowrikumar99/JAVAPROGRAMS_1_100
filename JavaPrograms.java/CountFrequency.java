
//76. Write a JAVAprogram to count frequency of each character in a string

public class CountFrequency{

    public static void main(String[] args) {
        String str = "This javatpoint website is awesome.";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}