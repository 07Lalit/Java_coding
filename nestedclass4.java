import java.util.*;
import java.lang.*;

abstract class my
{
	abstract void display();
}

class nestedclass4
{
	public static void main(String args[])
	{
		my m = new my()
			{
				public void display()
				{
					System.out.println("hello");
				}
			};
		m.display();
	}
}