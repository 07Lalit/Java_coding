import java.util.*;
import java.lang.*;

enum Dept
{
	CS,IT,CIVIL,ECE
}

public class enumdemo
{
	public static void main(String args[])
	{
		Dept d = Dept.IT;
		
		switch(d)
		{
			case CS: System.out.println("hii");
						break;
			case IT:
					System.out.println("Hello");
					break;

			case CIVIL:
					System.out.println("Okay");
					break;

			case ECE:
					System.out.println("Byee");
					break;
		}
	}
}