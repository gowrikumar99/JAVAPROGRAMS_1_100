// 22.calculate the area of circle

// area of circle = PI*r*r
// PI=22/7 or 3.14

import java.util.Scanner;
class AreaOfCycle{
    public static void main(String[] args) {
        final double PI=3.14,area;
        int r;
        Scanner sc=new Scanner(System.in);
        // enter radius of circle ex:- 4
        System.out.println("Enter radius of the circle :");
        r=sc.nextInt();
        area=PI*r*r;
        System.out.println("Area of circle : "+area);

    }
}

