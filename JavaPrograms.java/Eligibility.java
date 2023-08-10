// 17.age eligible for voting

import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int age=sc.nextInt();
      if(age>=18){
        System.out.println("eligible");
      }else{
        System.out.println("not eligible");
      }
        
    }
}