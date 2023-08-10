// 18.multiplication of table

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
      
        for(int i=0;i<=10;i++){
         System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
}