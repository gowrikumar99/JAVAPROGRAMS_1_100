// 9.character is vowel or consonent

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter any character : ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
       if(ch='a' || ch='e' || ch='i' ||ch='o' || ch='u'){
        System.out.println("vowels");
       }else{
        System.out.println("characters");
       }

    }
}