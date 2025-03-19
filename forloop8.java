import java.util.*;
import java.lang.*;

class forloop8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print it's digits : ");
		int t = sc.nextInt();
		int z= t;
		String str="";
		
		for(int i=1; t!=0; i++)
		{
			str = (t%10)+str;
			t=t/10;	
		}
		System.out.println(str);
		for(int j=0; j<str.length() ;j++)
		{
			switch (str.charAt(j))
			{
				case '0':
					System.out.println(" Zero ");
					break ;
				case '1':
					System.out.println(" One ");
					break ;
				case '2':
					System.out.println(" two ");
					break ;
				case '3':
					System.out.println(" three ");
					break ;
				case '4':
					System.out.println(" four ");
					break ;
				case '5':
					System.out.println(" five ");
					break ;
				case '6':
					System.out.println(" six ");
					break ;
				case '7':
					System.out.println(" seven ");
					break ;
				case '8':
					System.out.println(" eight ");
					break ;
				case '9':
					System.out.println(" Nine ");
					break ;
				default:
					System.out.println(" Nothing ");
					break ; 
				

			}
		}
		
		
	}
}