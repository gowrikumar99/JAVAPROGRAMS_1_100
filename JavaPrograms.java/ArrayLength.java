// 13). array length

import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the array size : ");
    int a=sc.nextInt();

    System.out.println("Enter the elementes : ");
    int b[]= new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array Elementes are : ");

    for(int i=0;i<b.length;i++){
      System.out.println(b[i]+" ");
    }
    System.out.println("Array length : "+b.length);
  }
}
