//5). even and odd elements in an array.

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size :");
        int a=sc.nextInt();

        System.out.println("Enter the Array Elementes :");
        int b[] =new int[a];
        
        for(int i=0;i<b.length;i++){
          b[i]=sc.nextInt();
        }
        
        System.out.println("Even numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2==0){
            System.out.println(b[i]);
          }
        }

        System.out.println("Odd numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2!=0){
            System.out.println(b[i]);
          }
        } 

    }
}