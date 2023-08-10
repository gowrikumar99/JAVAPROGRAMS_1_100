//30.Write a JAVAprogram to check whether a character is alphabet or not.

import java.util.Scanner;
class AlphabetOrNot
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