
// 29.Write a JAVAprogram to input any alphabet and check whether it is vowel or  consonant.

import java.util.Scanner;
class VowelOrNot
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
