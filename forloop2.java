import java.util.*;
import java.lang.*;

class forloop2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print a table: ");
		int t = sc.nextInt();

		for(int i=1; i<=10 ; i++)
		{
			System.out.println(t +" * " +i+" = " +(t*i));
		}
		
	}
}