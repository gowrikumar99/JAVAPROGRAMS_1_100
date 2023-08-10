// 17). find average of array elementes :

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elementes :");
    int a[]=new int[5];
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array elementes");
    for(int i=0;i<5;i++){
      System.out.println(a[i]+" ");
    }
    int sum=0;
    for(int i=0;i<5;i++){
      sum=sum+a[i];
    }
    int average=sum/5;
    System.out.println(sum+" "+average);
  }
}

