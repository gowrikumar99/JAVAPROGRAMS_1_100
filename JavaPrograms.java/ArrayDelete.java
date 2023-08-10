
9).Write a JAVAprogram to delete an element from an array at specified position.


71,23,66,99,45,56  elementes
0   1  2  3  4  5  indexes  


delection an element from array
===============================

for(i=location;i<max;i++){    // here i=2 index value maxium value =5; 2<5 condition is satisfied  then entering the loop array[2]=array[2+1],and
  moving the 3 index value 99 into 2 index value.again index value i=3 minimum value 3<5 condition is satisfied.......

  array[i]=array[i+1];    
}

max=5;

location =2;


import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    int array[] = new int[5];
    int location =0;
    int max=4;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter 5 integer values : ")

    for(int i=0;i<=max;i++){
      array[i] =sc.nextInt();
    }
    System.out.println("values in arrays are following : ");
    for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   

    System.out.println("Enter the location from where you want to delete the value(index value with 0)");
    location=sc.nextInt();
    for(int i=location;i<max;i++){
      array[i] =array[i+1];
    }
    System.out.println("Values in array after deleting the value from the location"+location);


   // print values in one by one
     for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   
  }
}