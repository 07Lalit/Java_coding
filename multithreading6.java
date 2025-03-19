import java.util.*;
import java.lang.*;

class my extends Thread
{	
	public void run()
	{
		System.out.println("hello");
	}
	
   public my(String name)
	{
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
	
}

public class multithreading6
{
	public static void main(String args[])
	{
		my t = new my("my thread 1");
		
		//System.out.println("ID : "+t.getId());
		System.out.println("Name of Thread : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		System.out.println("State of Thread:  "+t.getState());
		t.start();
		System.out.println("thread is alive or not : "+t.isAlive());
		//System.out.println( "Current Thread Name: "+ Thread.currentThread().getId());

	}

}