// 16. count digits in number.

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("no of digits : "+count);
    }
}
