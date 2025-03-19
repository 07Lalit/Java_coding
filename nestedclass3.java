import java.util.*;
import java.lang.*;

class outer
{
	int x = 10;
	
	class inner
	{
		int y=20;
		
		public void display()
		{
			System.out.println(x +" "+y);
		}
	}

	public void displayinner()
	{
		inner i = new inner();
		i.display();
	}
}

public class nestedclass3
{
	public static void main(String args[])
	{
		outer o = new outer();
		System.out.println(o.x);
		o.displayinner();

		outer.inner in = new outer().new inner();
		in.display();
	}
}