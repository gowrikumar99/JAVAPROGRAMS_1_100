
// 8. take character  input from the user.


import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character : ");
        
        char c;
        c=sc.next().charAt(0);
        System.out.println(c);

    }
}

