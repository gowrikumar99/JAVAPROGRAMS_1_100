// 34. wap to check divisible by 5
// input 10----->divisible by 5
// input 12-----> not divisible by 5

import java.util.Scanner;
class CheckDevesible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tany number : ");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5 :");
        }
    }
}

