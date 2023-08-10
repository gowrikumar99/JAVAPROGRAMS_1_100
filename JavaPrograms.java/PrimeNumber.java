// 40. check number is prime or not 
import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.println(i);
            }
        }
        if(count==2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
        
        
        
    }
}