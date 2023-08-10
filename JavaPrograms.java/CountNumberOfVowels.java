
// 66. Write a JAVAprogram to count total number of vowels and consonants in a string.

// count number of degits

// input 3456---->
/*
import java.util.Scanner;
class CountNumberOfVowels{
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits :"+count);
    }
}

*/
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int vowels=0, consonents=0;
        String str1="Hi Friends Welcone to our Channel";
        str1=str1.toLowerCase();

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || 
               str1.charAt(i)=='i' || str1.charAt(i)=='o' || 
               str1.charAt(i)=='u' ){
                vowels++;
               }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                 consonents++;
            }
        }  
    }
}



