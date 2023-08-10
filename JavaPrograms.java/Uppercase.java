
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