import java.util.*;
import java.lang.*;

class Cond5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a age of a person to check young or not : ");
		int a = sc.nextInt() ;
		
		
		if ( a>=14 && a<=55)
			{
				System.out.println("Person is Young");
			}
		else if (a<14 || a>55)
			{
				System.out.println("Person is not young");
			}
	}
}
