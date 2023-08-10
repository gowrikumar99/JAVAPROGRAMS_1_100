// 36 find sum of digits

import java.util.Scanner;
class FindSumOfDigits{
    public static void main(String[] args) {
        int num,r,sum=0;
        Scanner sc=new Scanner(System.in);
        // enter any number of digits 12345   ----15
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
       while(num>0){
         r=num%10;
         sum=sum+r;
         num=num/10;
       }
       System.out.println(sum);
    }
}