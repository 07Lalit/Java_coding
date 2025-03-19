import java.util.*;
import java.lang.*;

class MenuDriven2
	{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("MENU : ");
			System.out.println("  1: ADD ");
			System.out.println("  2: SUB ");
			System.out.println("  3: MUL ");
			System.out.println("  4: DIV ");
			System.out.println("\nEnter two number: ");
			int num1= sc.nextInt() ;
			int num2= sc.nextInt() ;
			System.out.print("\n Enter operation you want to perform from the menu: ");
        sc.nextLine();
			String str = sc.nextLine(); 
			

			switch (str)
			{
				case "ADD":
					System.out.println("\n Sum of two Number is : "+(num1+num2));
					break;
				case "SUB":
					System.out.println("\n Subtraction of two number is : "+(num1-num2));
					break;
				case "MUL":
					System.out.println("\n Multiplication of two number is : "+(num1*num2));
					break;
				case "DIV":
					System.out.println("\n Divide of two number is : "+(num1/num2));
					break;
				default :
					System.out.println("typed Wrong Operation as input.");
					break;
			}
		}
	}