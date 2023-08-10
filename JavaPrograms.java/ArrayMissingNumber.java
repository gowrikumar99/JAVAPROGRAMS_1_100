// 24).find single missing number in array

class Elementes1{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,5};
         // 1 ,2,3,4,5
        int sum=0;
        int n=arr.length;
        System.out.println("Length of the array is : "+n);

        int totalSum=(n+1)*(n+2)/2;
        System.out.println("sum of all the numbers : "+totalSum);

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int missingNumber=totalSum-sum;
        System.out.println("Missing number : "+missingNumber);
    }
}
