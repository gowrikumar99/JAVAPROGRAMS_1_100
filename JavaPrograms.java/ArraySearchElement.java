// 16).  SEARCH ELEMENTES IN ARRAY
  
import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Elamentes : ");
    int a[]= new int[5];

    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array Elementes : ");
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println("\nEnter search Element :");
    int n=sc.nextInt();

     int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==n){
        count++;
      }
    }
    if(count>0){
      System.out.println("Element Is Found ");
    }else{
      System.out.println("Element Is NotFound");
    }
  }
}
