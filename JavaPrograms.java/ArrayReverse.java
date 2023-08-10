//10).. reverse of the array

class Example{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {1,2,3,4};
    System.out.println("length of the array is : "+arr.length);
    System.out.println("Array reverse order : ");
    for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
    } 
  }
}