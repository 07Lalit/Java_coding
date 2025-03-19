import java.util.*;
import java.lang.*;

class outer
{ 
	public int x=10;

	class inner
	{		
		public int y=20;
		public void innerdisplay()
		{
			System.out.println("Value of outer x is: "+x);
			System.out.println("Value of inner y is : "+y);
		}
	}

	public void outerdisplay()
	{
		inner i = new inner();
		System.out.println("Value of inner y using outerdisplay() is : "+i.y);
		System.out.println("calling method innerdisplay usind outerdisplay() : ");
		i.innerdisplay();
	}
}

class nestedclass1
{
	public static void main(String args[])
	{
		outer o = new outer();
		System.out.println("Value of outer x is : "+o.x);
		o.outerdisplay();

		outer.inner oi = new outer().new inner();
		oi.innerdisplay();
	}
}