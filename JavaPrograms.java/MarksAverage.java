// 13.total and average markes of 5 subjects
import java.util.Scanner;
class MarksAverage{
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter markes of 5 subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("Total markes : " +sum);
        double avg=sum/5;
        System.out.println("avg markes : " +avg);

    }
}