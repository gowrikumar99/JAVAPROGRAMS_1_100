//32.Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;
class SpecialCharacter
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
