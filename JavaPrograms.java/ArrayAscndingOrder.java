
//18). array ascending order

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter elementes in array : ");
    int temp;
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(+a[i]+" ");
    }
  }
}

