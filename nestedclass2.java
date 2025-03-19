import java.util.*;
import java.lang.*;

class outer
{
	public void display()
	{
		class inner
		{
			public void abc()
			{
				System.out.println("inner class inside display method");
			}

		}
		
		inner i = new inner();
		i.abc();
	}
}

class nestedclass2
{
	public static void main(String args[])
	{
			outer o = new outer();
			o.display();
	}
}