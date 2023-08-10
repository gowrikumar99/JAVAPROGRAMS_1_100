// 38. Armstrong number 

import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        int num,r,arm=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
        temp=num;
       while(num>0){
         r=num%10;
         arm=(arm)+r*r*r;
         num=num/10;
       }
       if(temp==arm){
        System.out.println("armstrong number");
       }else{
        System.out.println("not armstrong number");
       }
    }
}