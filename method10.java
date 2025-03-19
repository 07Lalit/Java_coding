import java.util.*;
import java.lang.*;

class method10
{
	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	static boolean validate(int age)
	{
		return age>=3 && age<=15;
	}
	public static void main(String args[])
	{
		System.out.println(validate("L5alit Gour "));
		System.out.println(validate(12));
	}
}