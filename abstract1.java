import java.util.*;
import java.lang.*;

abstract class Super
{
	public Super()
	{
		System.out.println("Super constructor ");		
	}
	
	public void method1()
	{
		System.out.println("Method1 of super");
	}

	abstract public void method2() ;
}

class Sub extends Super
{
	public Sub()
	{
		System.out.println("Sub class constructor ");
	}

	@Override
	public void method2()
	{
		System.out.println("Sub class overide method2");
	}
	
}

public class abstract1
{
	public static void main(String args[])
	{
		Super s = new Sub();
		s.method1();
		s.method2();
	}
}