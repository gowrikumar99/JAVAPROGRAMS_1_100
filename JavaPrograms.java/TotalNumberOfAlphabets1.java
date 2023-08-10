//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string
import java.util.Scanner;
class TotalNumberOfAlphabets{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :-  ");
        String sentence=sc.nextLine();

        char letters[] = sentence.toCharArray(); // tochar()Array method dwara sentence lo store chesina charecters ni letters[] ane array lo store chesukuntunnamu.
        int alphabets =0;
        int numbers=0;
        int others=0;
        int spaces=0;

        for(int i=0;i<letters.length;i++){
           if(Character.isLetter(letters[i])){ 
              alphabets++;
           }else if(Character.isDigit(letters[i])){
            numbers++;
           }else if(Character.isSpaceChar(letters[i])){
             spaces++;
           }else{
            others++;
           }
        }
        System.out.println("Alphabets : "+alphabets);
        System.out.println("numbers: "+numbers);
        System.out.println("spacialcharactors"+spaces);
        System.out.println("spaces : " +others);
        sc.close();
    }
}