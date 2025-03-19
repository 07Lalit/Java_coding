import java.util.*;
import java.lang.*;

class Cond7
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string to check radix(bin,oct,hex,dec): ");
			String str1 = sc.nextLine();
			if (str1.matches("[01]+"))
			{
				System.out.println("The number is in binary form");
			}
			else if (str1.matches("[0-7]+"))
			{
				System.out.println("The number is in Octal form");
			}
			else if (str1.matches("[0-9]+"))
			{
				System.out.println("The number is in Decimal form");
			}
			else if (str1.matches("[0-9A-F]+"))
			{
				System.out.println("The number is in hexadecimal form");
			}
			else
			{
				System.out.println("It is not a number");
			}

		}
}