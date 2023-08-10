
// 35. reverse number

// input number  123---->  321
import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args) {
        int num,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        while(num>0){
          rem=num%10;
          System.out.println(rem);
          num=num/10;
        }
    }
}
