// 45.print reverse case of the string

import java.util.Scanner;
class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="gowrikumar";
        String temp=" ";
         // gowrikumar
        for(int i=str.length()-1;i>=0;i--){ // 9;8;7;6;5.....
            temp=temp+str.charAt(i);// r; a;m;u;k.....
        }
        System.out.println(temp);
    }
}
