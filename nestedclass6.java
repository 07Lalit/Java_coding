import java.util.*;
import java.lang.*;

class outer
{
	static int a =10;
	int b = 20 ;
	
	static class inner
	{
		void display()
		{
			System.out.println(a);
			//System.out.println(b);
		}
	}
}

public class nestedclass6
{
	public static void main(String args[])
	{
		outer.inner o = new outer.inner();
		o.display();
		outer i = new outer();
		System.out.println(i.b);
	}
}