// 10. ASCI values of characters
// input A------>65
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter any character : ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        int a=ch;

        System.out.println("Asci values of "+ch+" is : "+a);

    }
}
