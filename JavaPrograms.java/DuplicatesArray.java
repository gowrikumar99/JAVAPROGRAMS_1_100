//8). duplicates from array

class Example1{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {4,8,3,8,2,4};
    System.out.println("Duplicate elementes in given array");
    for(int i=0;i<arr.length;i++){ // here i=0 index value i=4 and j=i+1=5 conditions
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[j]);
        }
      }  
    }
  }
} 