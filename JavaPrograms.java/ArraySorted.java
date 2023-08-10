
// 12).  sorted elementes of an array in asending order

class Example{
  public static void main(String[] args) {

    // initilize the array
    int arr[]=new int[] {1,5,2,9,4};
    int temp=0;

    // we are printing theoriginal array
    System.out.println("Enter elementes of an array :");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }


    for(int i=0; i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){  //1>5  ; 1>4
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println();
    System.out.println("Enter of sorted array :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
