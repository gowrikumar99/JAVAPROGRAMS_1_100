
// 26 swaping two numbers without using third variables in java
// a=10 b=20
// a==20 b=10

import java.util.Scanner;
class SwappingTwoNumbers{
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swaping : " +a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping : " +a+" "+b);
    }
}
