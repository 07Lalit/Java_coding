import java.util.*;
import java.lang.*;

class forloop6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print it's digits : ");
		int t = sc.nextInt();
		int digit =0;
		
		for(int i=1; t!=0; i++)
		{
			digit++ ;
			t=t/10;
			
		}
		System.out.println("Number of digit is : "+digit);
		
	}
}