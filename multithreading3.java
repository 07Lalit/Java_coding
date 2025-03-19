import java.util.*;
import java.lang.*;

class my implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("using multithreading");
		}
	}
}

public class multithreading3
{
	public static void main(String args[])
	{
		my m = new my();
		Thread t = new Thread(m);
		t.start();
		while(true)
		{
			System.out.println("hii");
		}
	}
}