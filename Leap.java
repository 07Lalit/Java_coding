import java.util.*;
import java.lang.*;

class Leap
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a year to check it's a leap year or not : ");
			int year = sc.nextInt();
			
			if ((year%4)==0)
			{
				if ((year % 100) ==0)
				{
					if ((year % 400) ==0)
						{
							System.out.println(year+" is a leap Year.");
						}
					else
						{
							System.out.println(year+ " is not a leap Year.");
						}
				}
				else
				{
					System.out.println(year+" is a leap Year.");
				}
			}
			else
			{
				System.out.println( year+ " is not a leap year");
			}

		}
}