/*
  WAP to check largest number among three number 
  
  1) using if-else;
  2) using bitwise operator 
  3) using Math.max()
  4) using Collection.max() and ArrrayList in java
*/


import java.util.*;
import java.lang.*;


public class Main
{
	public static void main(String[] args) 
	{
		//System.out.println(Math.max(Math.max(10,20),50));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three number : ");
		int num1 = sc.nextInt(); sc.nextLine();
		int num2 = sc.nextInt(); sc.nextLine();
		int num3 = sc.nextInt(); sc.nextLine();
		System.out.print("\n Answer is : ");
		if((num1>num2) && (num1>num3))
		{
		    System.out.println(num1);
		}
		else if ((num2>num1) && (num2>num3))
		{
		    System.out.println(num2);
		}
		else
		{
		    System.out.println(num3);
		}
	}
}
