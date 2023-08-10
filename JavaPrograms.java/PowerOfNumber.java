// 12.calculate the power of number

// input n=5
// power p=3
// 5*5*5=125
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the power : ");
        int num2=sc.nextInt();
        int result=1;
        for(int i=1;i<=num2;i++){
        result=result*num1;
        }
       System.out.println(result);
        
    }
}