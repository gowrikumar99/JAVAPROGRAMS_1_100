
// 25.swaping two numbers

//  ram---->10   swam----->20
// ram----->20   swam------>10

import java.util.Scanner;
class Swapping{
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("before swaping "+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping "+a+" "+b);

    }
}