import java.util.*;
import java.lang.*;

class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);	
	}
	
	public void run()
	{
		int count =1 ;
		while(true)
		{
			System.out.println(count++);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class multithreading7
{
	public static void main(String args[])throws Exception
	{

		MyThread t = new MyThread("My Thread 1");
		t.start();
		t.interrupt();
	}
}