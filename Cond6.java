import java.util.*;
import java.lang.*;

class Cond6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of three subject out of 100  : ");
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		int total= a+b+c ;
		int avg = total/3 ;
		
		if ( avg>=70)
			{
				System.out.println("Excellent pass with A Grade");
			}
		else if (avg<70 && avg>=60)
			{
				System.out.println("Good Pass with B Grade ");
			}

		else if (avg<60 && avg>=50)
			{
				System.out.println(" Pass with C Grade ");
			}

		else if (avg<50 && avg>=40)
			{
				System.out.println("Pass with D Grade ");
			}
		else
			{
				System.out.println("Fail try again!!");
			}
	}
}
