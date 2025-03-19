import java.util.*;
import java.lang.*;

class parent
{
	parent()
	{
		System.out.println("Non-param of parent");
	}

	parent(int x,int y)
	{
		System.out.println("param of parent"+x+" , "+y);
	}
}

class child extends parent
{
	child()
	{
		System.out.println("Non-param of child");
	}
	child(int x,int y)
	{	
		super(x,y);
		System.out.println("param of child"+x+" "+y);
	}
}

public class inherit4
{
	public static void main(String args[])
	{
		child c= new child(20,30);
	}
}