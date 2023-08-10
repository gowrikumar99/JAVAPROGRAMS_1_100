 //69. Write a JAVAprogram to check whether a string is palindromeor not.
  
  import java.util.Scanner;
  class StringPolindrome{
    public static void main(String[] args) {
        String str="amma";
        String reverse="";

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter any string : ");
    str =sc.nextLine();
    
    int length=str.length();

        for(int i=length-1;i>=0;i--){
            reverse=reverse+str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println( str+" is not a palindrome");
        }
    }
  }