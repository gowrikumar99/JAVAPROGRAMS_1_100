//7). Write a JAVAprogram to copy all elements from an array to another array.

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        // Initilize first array
        int arr1[]= new int []{4,5,7};

        // create another array arr2 with same size as arr1
        int arr2[]=new int  [arr1.length];
        
        // copying all elementes of arr1 to arr2
        for(int i=0;i<arr1.length;i++){ // here we take i=0 .this value and we are checking arr1[]={4,5,7} 
             // and checking i<arr1.length(i=0<3) condition satisfy  then after i=0 means "i"  index value is 3
             // index value i= 0<3= satisfy (storing 4 value in arr2); 
             // i=1<3 satisfy (storing the value 5 value in arr2);the value i=2<3 (storing 7 value in arr2); i=3<3 this not satisfied loop is exit.

          arr2[i]=arr1[i]; //4;5/7
        }

        // printing the second array
       System.out.println("Display elementes of second array :");
       for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
       }
        
    }
}