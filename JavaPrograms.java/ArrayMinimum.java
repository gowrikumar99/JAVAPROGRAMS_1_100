// 4). Write a JAVAprogram to find maximum and minimum element in an array. 

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Size : ");
        int a=sc.nextInt();

        System.out.println("Enter The Array Elementes");
        int b[]= new int[a];
        
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
         int max=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
     System.out.println("Maximum Array Element : "+max);
     int min=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
     System.out.println("Minimum Array Element : "+min);
    }
}


class Main{
    public static void main(String args[]){
        int a[] ={1,2,3,4,5};
        
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                max=a[i];
            }
        }
        System.out.println(max);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
