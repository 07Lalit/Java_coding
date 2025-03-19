import java.util.*;
import java.lang.*;

class parent
{
	public parent()
	{
		System.out.println("parent class constructor");
	}
}

class child extends parent
{
	public child()
	{
		System.out.println("child class constructor");
	}
}

class grandchild extends child
{
	public grandchild()
	{
		System.out.println("grandchild class constructor");
	}
}

public class inherit3
{
	public static void main(String args[])
	{
		grandchild g = new grandchild();
	}
}