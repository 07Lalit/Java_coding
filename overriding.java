import java.util.*;
import java.lang.*;

class Super
{
	public void display()
	{
		System.out.println("super class display ");
	}
}

class Sub extends Super
{
	@Override
	public void display()
	{
		System.out.println("Sub class display");
	}
}

public class Overriding1
{
	public static void main(String args[])
	{
		Super sup = new Super();
		sup.display();
		Sub s= new Sub();
		s.display();
		Super m = new Sub();
		m.display();
	}
}