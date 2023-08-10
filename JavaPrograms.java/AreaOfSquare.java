// 23.calculate area of square

// area of square=side*side;

import java.util.Scanner;
class AreaOfSquare{
    public static void main(String[] args) {
        int side,area;
        //area of side=4;
        System.out.println("Enter the square : ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();  // side=4
        area=side*side; // 4*4=16;
        System.out.println("Area of Square : "+area);


    }
}