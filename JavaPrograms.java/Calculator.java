// 20.  calculator program
//input n1,n2---->(select operation) result

import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        // select operation enter the 1 or 2 or 3 or 4 operators
        System.out.println("select operation");
        ch=sc.nextInt();

        if(ch==1){
           cal=n1+n2;
           System.out.println("Addition : "+cal);
        }else if(ch==2){
           cal=n1-n2;
           System.out.println("substraction : "+cal);
        }else if(ch==3){
            cal=n1*n2;
           System.out.println("Multiplication : "+cal);
        }else if(ch==4){
            cal=n1/n2;
           System.out.println("division : "+cal);
        }else{
            cal=n1%n2;
           System.out.println("Remainder : "+cal);
        }
    }
}