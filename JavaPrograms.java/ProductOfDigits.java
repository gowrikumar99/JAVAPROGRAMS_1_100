// 42. Write a JAVAprogram to calculate product of digits of a number.

import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, temp;
        int product = 1;

        // Take input from user
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        temp = num;

        while(temp != 0) {

            product = product * (temp % 10);

            // Remove last digit from temp.
            temp = temp / 10;
        }

        System.out.println("\nProduct of all digits in " + num + " : " + product);
    }

}