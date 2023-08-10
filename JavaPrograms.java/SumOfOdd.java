// 7.sum of odd numbers.


import java.util.Scanner;
public class SumOfOdd{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
         int sum=0;
        for(int i=0;i<num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("sum of odd numbers are : "+sum);
    }
}