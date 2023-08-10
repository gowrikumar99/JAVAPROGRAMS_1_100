//21). Write a JAVAprogram to find second largest element in an array.


import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        int arr[]={8,2,5};
        int temp,size;
        size=arr.length;  // 3
        System.out.println("Array size is "+size);

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println();
        System.out.println("Elementes of array in ascending order");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Second Largest Number is : "+arr[size-2]);
    }
}