import java.util.*;
import java.lang.*;

class Day
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a day number to check today is which day : ");
			int day = sc.nextInt();
			
			if (day==1)
			{
				System.out.println("Today is Monday");
			}
			else if (day==2)
			{
				System.out.println("Today is Tuesday");
			}
			else if (day==3)
			{
				System.out.println("Today is Wednesday");
			}
			else if (day==4)
			{
				System.out.println("Today is Thursday");
			}
			else if (day==5)
			{
				System.out.println("Today is Friday");
			}
			else if (day==6)
			{
				System.out.println("Today is Saturday");
			}
			else if (day==7)
			{
				System.out.println("Today is Sunday");
			}
			else 
			{
				System.out.println("Invalid day number..");
			}


		}
}