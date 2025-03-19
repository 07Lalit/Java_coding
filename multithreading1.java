import java.util.*;
import java.lang.*;

class my extends Thread
{
	public void run()
	{
		for(; ;)
		{
			System.out.println("Hello ");
		}
	}
}

public class multithreading1
{
	public static void main(String args[])
	{
		my m = new my();
		m.start();
		for(; ;)
		{
			System.out.println("Lalit ");
	   }
	}
}