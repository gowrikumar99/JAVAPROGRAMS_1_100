// 21. calcalute area of rectangle program

// input length
// input breath
// formula length*breath

import java.util.Scanner;
class AreaofRectangle{
    public static void main(String[] args) {
        int l,b,area;
        Scanner sc= new Scanner(System.in);
        // ex:- l=10  b=12;
        System.out.println("Enter values for sides :");
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.println("Area of the rectangle :"+area);

    }
}
