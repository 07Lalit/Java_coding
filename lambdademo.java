import java.util.*;
import java.lang.*;

@FunctionalInterface
interface mylambda
{
	public void display();
}

/*
class my implements mylambda
{
	public void display()
	{
		System.out.println("Hello world");
	}
}
*/

public class lambdademo
{
	public static void main(String args[])
	{
		/*mylambda m = new mylambda()
		{
			public void display()
			{
				System.out.println("Hello");
			}
		};
		*/

		mylambda m = 
				()->
				{
					System.out.println("HII");
				};
		m.display();
	}
}