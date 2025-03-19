import java.util.*;
import java.lang.*;

class multithreading4 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Learning java");
		}
	}

	public static void main(String args[])
	{
		multithreading4 m = new multithreading4();
		Thread t = new Thread(m);
		t.start();
		while(true)
		{
			System.out.println("I Know python programming language");
		}
	}
}