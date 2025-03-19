import java.util.*;
import java.lang.*;

class super
{
	public void display()
	{
		System.out.println("super class display ");
	}
}

class sub extends super
{
	
	public void display()
	{
		System.out.println("Sub class display");
	}
}

public class overriding1
{
	public static void main(String args[])
	{
		super su= new super();
		su.display();
		sub s = new sub();
		s.display();
		
	}
}