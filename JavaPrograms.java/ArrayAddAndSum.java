//15). add and sum of all array elementes


  //   *find sum of array elementes  *

  import java.util.Scanner;
  class Example{
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the Array size : ");
      int a=sc.nextInt();

      System.out.println("Enter the array elementes :");
      int b[] =new int[a];

      for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
      }

      System.out.println("Array elementes : ");
      int sum=0;
      for(int i=0;i<b.length;i++){
        sum=sum+b[i];
        System.out.println(b[i]+" ");
      }
     System.out.println("ADDITION OF ARRAY ELEMENTES : "+sum);
    }
  }