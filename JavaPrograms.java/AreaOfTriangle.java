
// 24. Area of triangle projram

// input a b c 
// 1.find semiperimeter
// 2.area of triangle

import java.util.Scanner;
//import java.lang.Math;
class AreaOfTriangle{
    public static void main(String[] args) {
        int a,b,c,sp,area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for sides of triangle :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of triangle "+area);

    }
}
