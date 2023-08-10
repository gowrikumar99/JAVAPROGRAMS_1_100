//44.febonoses number.

import java.util.Scanner;

public class Febonoses{
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        term = sc.nextInt();
        
        for (int i = 1; i <= term; ++i) {  // term=5  ; 1<5;  2<5
            System.out.print(a+ " + "); // 0  ;1 ;1
            c=a+b;   // c=1;  c=2;  c=3;
            a=b;   // a=1;  1;  2;
            b=c;  // b=1;   2;  3

            
        }
    }
}
