// 37. check number is polidrome or not 

import java.util.Scanner;
class polindromeOrNot{
    public static void main(String[] args) {
        int num,r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
        temp=num;
       while(num>0){
         r=num%10;
         sum=(sum*10)+r;
         num=num/10;
       }
       if(temp==sum){
        System.out.println("polindrome");
       }else{
        System.out.println("not polindrome");
       }
    }
}


