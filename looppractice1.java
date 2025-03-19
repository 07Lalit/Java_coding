import java.util.*;
import java.lang.*;

class looppractice1
{
	public static void main(String args[])
	{
		int i = 1 ;
		int n= 100;
		while (i<=100)
		{  
			System.out.println(i);
			i = i*2;
		}	

		System.out.println("\n\n");
		i=1;
		n=100;
		do
		{
			System.out.println(i);
			i=i*2;
		}while(i<=100);	

	}
}