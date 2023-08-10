/* 
// 1.two numbers adding
public class Sample {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(a+b);
    }
}




// 2.take input from the user
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         System.out.println(num1+num2);
    }
}



// 3. even or odd numbers checking
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
        
         if(num%2==0){
            System.out.println("even number");
         }else{
            System.out.println("odd number : ");
         }
    }
}



// 4.print first N natural numbers 

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
        
         for(int i=0;i<num;i++){
     System.out.println(i+" ");
         }
    }
}

// 5.sum of natural numbers

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
         int sum=0;
         for(int i=0;i<=num;i++){
           sum=sum+i;
         }
         System.out.println(sum);
    }
}



// 6. print the odd numbers beetwen 1 to n

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
         int num=sc.nextInt();
         
        for(int i=0;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

// 7.sum of odd numbers.


import java.util.Scanner;
public class Sample {
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



// 9.character is vowel or consonent

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter any character : ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
       if(ch='a' || ch='e' || ch='i' ||ch='o' || ch='u'){
        System.out.println("vowels");
       }else{
        System.out.println("characters");
       }

    }
}

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

// 11 print A TO Z alphabets
// ABCDEFGHIJKLMNOPQRS
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        
        for(char i='A';i<='Z';i++){
            System.out.println(i+" ");
        }
    }
}

// 12.calculate the power of number

// input n=5
// power p=3
// 5*5*5=125
import java.util.Scanner;
public class Sample {
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


// 13.total and average markes of 5 subjects
import java.util.Scanner;
class Sample{
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

// 14. find the factorial of a number

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       int fact=1;
       for(int i=1;i<=num;i++){
        fact=fact*i;
       }
        System.out.println(fact);
    }
}

// 15.factor of a nuumber

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       for(int i=1;i<=num;i++){
        if(num%i==0){
       System.out.println(i);
        }
       }
    }
}

// 16. count digits in number.

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
       int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("no of digits : "+count);
    }
}


// 17.age eligible for voting

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int age=sc.nextInt();
      if(age>=18){
        System.out.println("eligible");
      }else{
        System.out.println("not eligible");
      }
        
    }
}


// 18.multiplication of table

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
      
        for(int i=0;i<=10;i++){
         System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
}


// 19 . tax calculation program
// input sal<=10000  -- > no tax
// input sal>10000 b/w sal<=100000---->10% tax
// input sal>100000  ----20% tax;


import java.util.Scanner;
class Sample{
    public static void main(String[] args) {
    int sal; double tax;
    System.out.println("Enter salary : ");
    Scanner sc=new Scanner(System.in);
    sal=sc.nextInt();
    if(sal<=10000){
        System.out.println(sal+"No tax");
    }else if(sal>10000 && sal<=100000){
        tax=sal*0.10;
        System.out.println(sal+" "+tax);
    }else{
         tax=sal*0.20;
        System.out.println(sal+" "+tax);
    }
    
    }
}

*/

// 64. Write a JAVAprogram to find length of a string and compare and concatenate two strings

/* 
class Example{
    public static void main(String[] args) {
        String a="GOWRI";
        String b="kumar";
       
        // lowercase and uppercase methods
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        // concat and length methods
        System.out.println(a.concat(b));
        System.out.println(b.length());
        
        // trim and isEmpty methods;
        String c="    gowrikumar     ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        
        // charAt and isEmpty methods
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('O'));
        System.out.println(b.equals(a));
    
    // comparession method
    if(a==b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}

//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :-  ");
        String sentence=sc.nextLine();

        char letters[] = sentence.toCharArray(); // tochar()Array method dwara sentence lo store chesina charecters ni letters[] ane array lo store chesukuntunnamu.
        int alphabets =0;
        int numbers=0;
        int others=0;
        int spaces=0;

        for(int i=0;i<letters.length;i++){
           if(Character.isLetter(letters[i])){ 
              alphabets++;
           }else if(Character.isDigit(letters[i])){
            numbers++;
           }else if(Character.isSpaceChar(letters[i])){
             spaces++;
           }else{
            others++;
           }
        }
        System.out.println("Alphabets : "+alphabets);
        System.out.println("numbers: "+numbers);
        System.out.println("spacialcharactors"+spaces);
        System.out.println("spaces : " +others);
        sc.close();
    }
}

// 66. Write a JAVAprogram to count total number of vowels and consonants in a string.

// count number of degits

// input 3456---->
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits :"+count);
    }
}


import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int vowels=0, consonents=0;
        String str1="Hi Friends Welcone to our Channel";
        str1=str1.toLowerCase();

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || 
               str1.charAt(i)=='i' || str1.charAt(i)=='o' || 
               str1.charAt(i)=='u' ){
                vowels++;
               }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                 consonents++;
            }
        }


        
    }
}




/* 
// 20.  calculator program
//input n1,n2---->(select operation) result

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        // select operation enter the 1 or 2 or 3 or 4 operators
        System.out.println("select operation");
        ch=sc.nextInt();

        if(ch==1){
           cal=n1+n2;
           System.out.println("Addition : "+cal);
        }else if(ch==2){
           cal=n1-n2;
           System.out.println("substraction : "+cal);
        }else if(ch==3){
            cal=n1*n2;
           System.out.println("Multiplication : "+cal);
        }else if(ch==4){
            cal=n1/n2;
           System.out.println("division : "+cal);
        }else{
            cal=n1%n2;
           System.out.println("Remainder : "+cal);
        }
    }
}

// 21. calcalute area of rectangle program

// input length
// input breath
// formula length*breath

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int l,b,area;
        Scanner sc= new Scanner(System.in);
        // ex:- l=10  b=12;
        System.out.println("Enter values for sides :");
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.println("Area of the rectangle :"+area);

    }
}


// 22.calculate the area of circle

// area of circle = PI*r*r
// PI=22/7 or 3.14

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        final double PI=3.14,area;
        int r;
        Scanner sc=new Scanner(System.in);
        // enter radius of circle ex:- 4
        System.out.println("Enter radius of the circle :");
        r=sc.nextInt();
        area=PI*r*r;
        System.out.println("Area of circle : "+area);

    }
}


// 23.calculate area of square

// area of square=side*side;

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int side,area;
        //area of side=4;
        System.out.println("Enter the square : ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();  // side=4
        area=side*side; // 4*4=16;
        System.out.println("Area of Square : "+area);


    }
}



// 24. Area of triangle projram

// input a b c 
// 1.find semiperimeter
// 2.area of triangle

import java.util.Scanner;
//import java.lang.Math;
class Example{
    public static void main(String[] args) {
        int a,b,c,sp,area;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for sides of triangle :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of triangle "+area);

    }
}



// 25.swaping two numbers

//  ram---->10   swam----->20
// ram----->20   swam------>10

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("before swaping "+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping "+a+" "+b);

    }
}


// 26 swaping two numbers without using third variables in java
// a=10 b=20
// a==20 b=10

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swaping : " +a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping : " +a+" "+b);
    }
}


// 27. convert upper case to lower case characters.
// input a to z ----> Uppercase
// input A to Z ----> Lowercase


import java.util.Scanner;
class Upper_Lower
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);			
		if(ch>='a' && ch<='z')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else
		{
			System.out.println("This is a Uppercase Alphabet");
		}
	}
}
// 28. number is positive or negetive

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("positive number :");
        }else{
            System.out.println("negetive number");
        }
    }
}

// 29.Write a JAVAprogram to input any alphabet and check whether it is vowel or  consonant.

import java.util.Scanner;
class Vowel_Consonant
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);			
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("This is a Vowel");
		}
		else
		{
			System.out.println("This is a Consonant");
		}
	}
}

//30.Write a JAVAprogram to check whether a character is alphabet or not.

import java.util.Scanner;
class Check_Alphabet
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);
 
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a Alphabet");
		}
		else
		{
			System.out.println("This is a Not Alphabet");
		}
	}
}



// 31.leaf year or not not leaf year 
// 1. century(100%=0 and 400%=0)  2000 2400   1700 1800
// 2.yearly (100%!=0 and 4%=0)    2020 2024    2021 2022

//32.Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;
class Alpha_Num_Spl
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Values :");
		char ch = input.next().charAt(0);			
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is a Number");
		}
		else
		{
			System.out.println("This is a Special Character");
		}
	}
}


 // 33. Write a JAVAprogram to input week number and print week day.

import java.util.Scanner;
class WeekDay
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = input.nextInt();			
		if(num==1)
			System.out.println("This is a Sunday");
		else if(num==2)
			System.out.println("This is a Monday");
		else if(num==3)
			System.out.println("This is a Tuesday");
		else if(num==4)
			System.out.println("This is a Wednesday");
		else if(num==5)
			System.out.println("This is a Thursday");
		else if(num==6)
			System.out.println("This is a Friday");
		else if(num==7)
			System.out.println("This is a Saturday");
		else
			System.out.println("Enter 1 to 7...");
	}
}



// 34. wap to check divisible by 5
// input 10----->divisible by 5
// input 12-----> not divisible by 5

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tany number : ");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5 :");
        }
    }
}






// 35. reverse number

// input number  123---->  321
import java.util.Scanner;
class Example{
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



// 36 find sum of digits

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int num,r,sum=0;
        Scanner sc=new Scanner(System.in);
        // enter any number of digits 12345   ----15
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
       while(num>0){
         r=num%10;
         sum=sum+r;
         num=num/10;
       }
       System.out.println(sum);
    }
}



// 37. check number is polidrome or not 

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int num,r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
        temp=num;
       while(num>0){
         r=num%10;
         sum=(sum*10)+r;
         num=num/10;
       }
       if(temp==sum){
        System.out.println("polindrome");
       }else{
        System.out.println("not polindrome");
       }
    }
}



// 38. Armstrong number 

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int num,r,arm=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();
        
        temp=num;
       while(num>0){
         r=num%10;
         arm=(arm)+r*r*r;
         num=num/10;
       }
       if(temp==arm){
        System.out.println("armstrong number");
       }else{
        System.out.println("not armstrong number");
       }
    }
}


// 39.find squar root of number

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe : ");
        num=sc.nextInt();

       
        
       
        
    }
}

// 40. check number is prime or not 
import java.util.Scanner;
class Example{
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

//41.  Write a JAVAprogram to enter a number and print its reverse.

import java.util.Scanner;
public class ReverseOfANumber {
   public static void main(String args[]) {
      int d, number,temp, revnum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextInt();
      temp = number;
      while (temp >0) {
         d = temp %10;
         revnum = (revnum*10)+d;
         temp = temp/10;
      }
      System.out.println("Reverse of the given number is:"+revnum);
   }
}

// 42. Write a JAVAprogram to calculate product of digits of a number.

import java.util.Scanner;

public class DigitProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, temp;
        int product = 1;

        // Take input from user
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        temp = num;

        while(temp != 0) {

            product = product * (temp % 10);

            // Remove last digit from temp.
            temp = temp / 10;
        }

        System.out.println("\nProduct of all digits in " + num + " : " + product);
    }

}

43. Write a JAVAprogram to find frequency of each digit in a given integer.

import java.util.*;
class Frequency
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int number,i,count,digit,temp;
        System.out.println("Enter any Number : ");
        number=sc.nextInt();
         System.out.println("Digit\tFrequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }
}

// 42.perfect number or not 

// input num 6  ------>1 2 3 4 5
// 6--------> 1+2+3=6

import java.util.Scanner;
class PerfectNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter ant number :");
    int num=input.nextInt(); //28
    int sum=0;
    for(int i=1;i<=num;i++){  //1<=28
      if(num%i==0){    //28%1=28,28%2=14,28%4=7,28%7=4,28%14=2,28%28=1;===(28=14+7+4+2+1)
        sum=sum+i; //sum=0+1=1,1+2=3,3+4=7,7+7=14,14+14=28;
      }
    }
    if(num==sum){
      System.out.println("perfect number");
      
    }else{
      System.out.println("not perfect number");
    }
  }
}
// 43. print all prime numbers between range 1 to n :

import java.util.Scanner;
class Example{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println(i+" ");
            }
        }
        
    }
}


44.febonoses number.

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        term = sc.nextInt();
        
        for (int i = 1; i <= term; ++i) {  // term=5  ; 1<5;  2<5
            System.out.print(a+ " + "); // 0  ;1 ;1
            c=a+b;   // c=1;  c=2;  c=3;
            a=b;   // a=1;  1;  2;
            b=c;  // b=1;   2;  3

            
        }
    }
}



// 45.print reverse case of the string

import java.util.Scanner;
class Example{
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




// 64 . . Write a JAVAprogram to find length of a string and compare and concatenate two strings.

class Example{
    public static void main(String[] args) {
        String a="GOWRI";
        String b="kumar";
       
        // lowercase and uppercase methods
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        // concat and length methods
        System.out.println(a.concat(b));
        System.out.println(b.length());
        
        // trim and isEmpty methods;
        String c="    gowrikumar     ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        
        // charAt and isEmpty methods
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('O'));
        System.out.println(b.equals(a));
    
    // comparession method
    if(a==b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}

//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :-  ");
        String sentence=sc.nextLine();

        char letters[] = sentence.toCharArray(); // tochar()Array method dwara sentence lo store chesina charecters ni letters[] ane array lo store chesukuntunnamu.
        int alphabets =0;
        int numbers=0;
        int others=0;
        int spaces=0;

        for(int i=0;i<letters.length;i++){
           if(Character.isLetter(letters[i])){ 
              alphabets++;
           }else if(Character.isDigit(letters[i])){
            numbers++;
           }else if(Character.isSpaceChar(letters[i])){
             spaces++;
           }else{
            others++;
           }
        }
        System.out.println("Alphabets : "+alphabets);
        System.out.println("numbers: "+numbers);
        System.out.println("spacialcharactors"+spaces);
        System.out.println("spaces : " +others);
        sc.close();
    }
}

// 66. Write a JAVAprogram to count total number of vowels and consonants in a string.

// count number of degits

// input 3456---->
import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits :"+count);
    }
}


import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        int vowels=0, consonents=0;
        String str1="Hi Friends Welcone to our Channel";
        str1=str1.toLowerCase();

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || 
               str1.charAt(i)=='i' || str1.charAt(i)=='o' || 
               str1.charAt(i)=='u' ){
                vowels++;
               }
            else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                 consonents++;
            }
        }
    }
}



// 67. Write a JAVAprogram to count total number of words in a string

class Example{
    public static void main(String[] args) {
        String str="Welcome to gowri kumar";
        String arr[] = str.split(" ");
            System.out.println("count of wordds :"+arr.length);
        }
    }

    

  // 68. Write a JAVAprogram to find reverse of a string 45 ans
  //69. Write a JAVAprogram to check whether a string is palindromeor not.
  
  import java.util.Scanner;
  class Example{
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
  

  // 70. Write a JAVAprogram to find first occurrence of a character in a given string
  
  class Example{
    // indexOf method returns index of particular character.()
    // index of returns -1 when the character is not presenting

    public static void main(String[] args) {
        String str="Hello world";

        System.out.println(str.indexOf("o"));
    }
  }

  
  // 71. last occurance in string 
  class Example{
    public static void main(String[] args) {
        String str="Gowrikumar";
        int index= str.lastIndexOf("r");
        System.out.println(index);
    }
  }

  72. Write a JAVAprogram to search all occurrences of a character in given string
  
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String str = "Java program to search all occurrences of a character in given string";
    Map<Character, Integer> charCountMap = new HashMap<>();
    char[] strArray = str.toCharArray();
    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }
    System.out.println("Occurrence of each character in the given string: ");
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}


73. Write a JAVAprogram to count occurrences of a character in given string.

import java.util.HashMap;
import java.util.Map;

public class gowri {
    public static void main(String[] args) {
        String str = "gowrikumar dukka ";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Character Count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


74. Write a JAVAprogram to find highest frequency character in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("The Maximum Occurring Character: " + maxChar);
    }
}


75. Write a JAVAprogram to find lowest frequency character in a string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        char minChar = str.charAt(0);
        int minFreq = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            if (freq[ch] < minFreq) {
                minChar = ch;
                minFreq = freq[ch];
            }
        }
        System.out.println("The lowest frequency character in the string is " + minChar);
    }
}


76. Write a JAVAprogram to count frequency of each character in a string

public class Frequency {

    public static void main(String[] args) {
        String str = "This javatpoint website is awesome.";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
Output

Frequency of e = 4



import java.util.Scanner;

 

class MinNotes
  {
    public static void main(String args [])
    {
     Scanner sc= new Scanner(System.in);

 

      System.out.println("enter the amount");
      int amt= sc.nextInt();

 

      int notes;

 

      int sum=0;

 

     
     if(amt>=500)
     {
       notes = amt/500;
       System.out.println("the 500 notes are "+ notes);
       sum=sum+notes;
       
     } 
      int remain = amt%500;
       if(remain>=100)
       {
         notes = remain/100;
         System.out.println("the 100 notes are "+notes);
         sum=sum+notes;
        
       }
       remain=remain%100;
      if(remain>=50)
      {
        notes=remain/50;
        System.out.println("the 50 notes are "+notes);

 

        sum=sum+notes;

 

        
      }

 

      System.out.println("the total no of notes are " +sum);
   
    
    
    
    
    }
      
    }
  

/* 
1).different ways to print array

class Example{
  public static void main(String[] args) {
    int a[] = new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}

2).negitive elementes in Array

public class Example1{
    public static void main(String[] args) {
      int[] arr = {1, -2, 3, -4, 5};
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
          System.out.println(arr[i]);
        }
      }
    }
}
  
o/p -2,-4

3). Write a JAVAprogram to count total number of negative elements in an array.

import java.util.*;
class gowri{
    public static void main(String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int negativeCount=0;
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                negativeCount++;
            }
        }
        System.out.println("Total Negative Number : " + negativeCount );
    }
}

o/p
enter the size of array 5:
enter array elementes 1,-2,-3,4,-9
total negetive elementes :3

4). Write a JAVAprogram to find maximum and minimum element in an array. 

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Size : ");
        int a=sc.nextInt();

        System.out.println("Enter The Array Elementes");
        int b[]= new int[a];
        
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
         int max=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
     System.out.println("Maximum Array Element : "+max);
     int min=b[0];
         for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
     System.out.println("Minimum Array Element : "+min);
    }
}


class Main{
    public static void main(String args[]){
        int a[] ={1,2,3,4,5};
        
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                max=a[i];
            }
        }
        System.out.println(max);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
5). even and odd elements in an array.

import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size :");
        int a=sc.nextInt();

        System.out.println("Enter the Array Elementes :");
        int b[] =new int[a];
        
        for(int i=0;i<b.length;i++){
          b[i]=sc.nextInt();
        }
        
        System.out.println("Even numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2==0){
            System.out.println(b[i]);
          }
        }

        System.out.println("Odd numbers are : ");
        for(int i=0;i<b.length;i++){
          if(b[i]%2!=0){
            System.out.println(b[i]);
          }
        } 

    }
}

6). Write a JAVAprogram to count total number of even and odd elements in an array.

import java.util.*;
class Main{
    public static void main(String ...a){
        int arr[] = new int[]{ 1,2,3,4,5,6,7,8,9,10,11 }; 
        int evenCount=0, oddCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total Even Number : " + evenCount + "\nTotal Odd Number : "+oddCount);
    }
}

o/p
total even numbers:5
total odd numbers :6

7). Write a JAVAprogram to copy all elements from an array to another array.

import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        // Initilize first array
        int arr1[]= new int []{4,5,7};

        // create another array arr2 with same size as arr1
        int arr2[]=new int  [arr1.length];
        
        // copying all elementes of arr1 to arr2
        for(int i=0;i<arr1.length;i++){ // here we take i=0 .this value and we are checking arr1[]={4,5,7} 
             // and checking i<arr1.length(i=0<3) condition satisfy  then after i=0 means "i"  index value is 3
             // index value i= 0<3= satisfy (storing 4 value in arr2); 
             // i=1<3 satisfy (storing the value 5 value in arr2);the value i=2<3 (storing 7 value in arr2); i=3<3 this not satisfied loop is exit.

          arr2[i]=arr1[i]; //4;5/7
        }

        // printing the second array
       System.out.println("Display elementes of second array :");
       for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
       }
        
    }
}

8). duplicates from array

class Example1{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {4,8,3,8,2,4};
    System.out.println("Duplicate elementes in given array");
    for(int i=0;i<arr.length;i++){ // here i=0 index value i=4 and j=i+1=5 conditions
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[j]);
        }
      }  
    }
  }
} 

9).Write a JAVAprogram to delete an element from an array at specified position.


71,23,66,99,45,56  elementes
0   1  2  3  4  5  indexes  


delection an element from array
===============================

for(i=location;i<max;i++){    // here i=2 index value maxium value =5; 2<5 condition is satisfied  then entering the loop array[2]=array[2+1],and
  moving the 3 index value 99 into 2 index value.again index value i=3 minimum value 3<5 condition is satisfied.......

  array[i]=array[i+1];    
}

max=5;

location =2;


import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    int array[] = new int[5];
    int location =0;
    int max=4;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter 5 integer values : ")

    for(int i=0;i<=max;i++){
      array[i] =sc.nextInt();
    }
    System.out.println("values in arrays are following : ");
    for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   

    System.out.println("Enter the location from where you want to delete the value(index value with 0)");
    location=sc.nextInt();
    for(int i=location;i<max;i++){
      array[i] =array[i+1];
    }
    System.out.println("Values in array after deleting the value from the location"+location);


   // print values in one by one
     for(int i=0;i<max;i++){
      System.out.println(array[i]);
    }
   
  }
}

10).. reverse of the array

class Example{
  public static void main(String[] args) {
    // initilize an array
    int arr[]=new int[] {1,2,3,4};
    System.out.println("length of the array is : "+arr.length);
    System.out.println("Array reverse order : ");
    for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
    } 
  }
}

11).largest element in array 

class example{
  public static void main(String[] args) {

    // initilize the values
    int arr[]=new int[] {85,25,33,405,52};

    // max value is stoterd in arr[0] means arr[85] with comparing with others elementes
    int max=arr[0]; // i=0; 85 stored;  405 stored
    for(int i=1;i<arr.length;i++){ // i=1 means ;i<2  ; i<3 ;i<4
      if(arr[i]>max){//  85<25 condition false; 85<33 condition false; 85<405  condion true now  ; 405<52 condition is false
        max=arr[i];
      }
    }
    System.out.println("Largest element in an array : "+max);
  }
}

12).  sorted elementes of an array in asending order

class Example{
  public static void main(String[] args) {

    // initilize the array
    int arr[]=new int[] {1,5,2,9,4};
    int temp=0;

    // we are printing theoriginal array
    System.out.println("Enter elementes of an array :");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }


    for(int i=0; i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){  //1>5  ; 1>4
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println();
    System.out.println("Enter of sorted array :");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}


13). array length

import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the array size : ");
    int a=sc.nextInt();

    System.out.println("Enter the elementes : ");
    int b[]= new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array Elementes are : ");

    for(int i=0;i<b.length;i++){
      System.out.println(b[i]+" ");
    }
    System.out.println("Array length : "+b.length);
  }
}




14).   reverse order


import java.util.Scanner;
class Example{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size : ");
    int a = sc.nextInt();

    System.out.println("Enter the array elementes : ");
    int b[]=new int[a];

    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
    }
    System.out.println("Array reverse elementes");
    for(int i=b.length-1;i>=0;i--){
      System.out.print(b[i]+" ");
    }
  }
}


15). add and sum of all array elementes


  //   *find sum of array elementes  *

  import java.util.Scanner;
  class Example{
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the Array size : ");
      int a=sc.nextInt();

      System.out.println("Enter the array elementes :");
      int b[] =new int[a];

      for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
      }

      System.out.println("Array elementes : ");
      int sum=0;
      for(int i=0;i<b.length;i++){
        sum=sum+b[i];
        System.out.println(b[i]+" ");
      }
     System.out.println("ADDITION OF ARRAY ELEMENTES : "+sum);
    }
  }

  

16).  SEARCH ELEMENTES IN ARRAY
  
import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Elamentes : ");
    int a[]= new int[5];

    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array Elementes : ");
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println("\nEnter search Element :");
    int n=sc.nextInt();

     int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==n){
        count++;
      }
    }
    if(count>0){
      System.out.println("Element Is Found ");
    }else{
      System.out.println("Element Is NotFound");
    }
  }
}


17). find average of array elementes :

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elementes :");
    int a[]=new int[5];
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Array elementes");
    for(int i=0;i<5;i++){
      System.out.println(a[i]+" ");
    }
    int sum=0;
    for(int i=0;i<5;i++){
      sum=sum+a[i];
    }
    int average=sum/5;
    System.out.println(sum+" "+average);
  }
}



18). array ascending order

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter elementes in array : ");
    int temp;
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(+a[i]+" ");
    }
  }
}



19). array descnding order

import java.util.Scanner;
class Example{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter elementes in array : ");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(a[i]<a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(+a[i]+" ");
    }
  }
}


// 20). insert item in array particular position


import java.util.Scanner;
class Element1{
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size : ");
        size=sc.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter Array Elementes : ");

        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
       System.out.println("Enter Array Location : ");
       loc=sc.nextInt();
       System.out.println("Enter new item : ");
       item=sc.nextInt();

       for(i=size;i>loc;i--){
         a[i]=a[i-1];
       }
      a[loc]=item;
      size++;

      for(i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }

    }
}

//21). Write a JAVAprogram to find second largest element in an array.


import java.util.Scanner;
class Example1{
    public static void main(String[] args) {
        int arr[]={8,2,5};
        int temp,size;
        size=arr.length;  // 3
        System.out.println("Array size is "+size);

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println();
        System.out.println("Elementes of array in ascending order");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Second Largest Number is : "+arr[size-2]);
    }
}


22).Write a JAVAprogram to count frequency of each element in an array.

import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size : ");
    int a=sc.nextInt();
    System.out.println("Enter the elementes: ");
    int b[]=new int[a];   // 1,2 3 4,1,2,3
    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt(); 
    }
    boolean c[]=new boolean[a];
    for(int j=0;j<c.length;j++){
      c[j]=false;
    }
    for(int i=0;i<c.length;i++){
      int count=1;
      if(c[i]==true){
        continue;
      }
      for(int j=i+1;j<b.length;j++){
        if(b[i]==b[j]){
          count++;
          c[j]=true;
        }
      }
       System.out.println(b[i]+" "+count); 
    }
  }
}



//23).Write a JAVAprogram to print all unique elements in the array.

// 24).find single missing number in array
*/
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




  */
