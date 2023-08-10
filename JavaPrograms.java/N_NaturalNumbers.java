
// 4.print first N natural numbers 

import java.util.Scanner;
public class N_NaturalNumbers {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
        
         for(int i=0;i<num;i++){
     System.out.println(i+" ");
         }
    }
}
