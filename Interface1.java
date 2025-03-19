import java.util.*;
import java.lang.*;

interface test
{
	void method1();
	void method2();
}

class my implements test 
{
	public void method1()
	{
		System.out.println("method1 of myclass");
	}

	public void method2()
	{
		System.out.println("method2 of myclass");
	}

	public void method3()
	{
		System.out.println("method3 of myclass");
	}
}

public class Interface1
{
	public static void main(String args[])
	{
		test m = new my();
		m.method1();
		m.method2();
		//m.method3();

		System.out.println("\n");
		
		my ma = new my();
		ma.method1();
		ma.method2();
		ma.method3();
	}
}