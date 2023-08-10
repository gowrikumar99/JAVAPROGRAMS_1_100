//11).largest element in array 

class example{
  public static void main(String[] args) {

    // initilize the values
    int arr[]=new int[] {85,25,33,405,52};

    // max value is stoterd in arr[0] means arr[85] with comparing with others elementes
    int max=arr[0]; // i=0; 85 stored;  405 stored
    for(int i=1;i<arr.length;i++){ // i=1 means ;i<2  ; i<3 ;i<4
      if(arr[i]>max){//  85<25 condition false; 85<33 condition false; 85<405  condion true now  ; 405<52 condition is false
        max=arr[i];
      }
    }
    System.out.println("Largest element in an array : "+max);
  }
}