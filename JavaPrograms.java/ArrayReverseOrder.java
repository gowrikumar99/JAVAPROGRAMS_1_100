// 14).   reverse order


import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size : ");
    int a = sc.nextInt();

    System.out.println("Enter the array elementes : ");
    int b[]=new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array reverse elementes");
    for(int i=b.length-1;i>=0;i--){
      System.out.print(b[i]+" ");
    }
  }
}

