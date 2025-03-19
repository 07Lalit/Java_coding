import java.util.*;
import java.lang.*;

class multithreading2 extends Thread
{
	public void run()
		{
			while(true)
			{
				System.out.println("Hello ");
			}
		}

	public static void main(String args[])
	{
		
		multithreading2 m = new multithreading2();
		m.start();
		while(true)
		{
			System.out.println("Lalit Gour ");
	   }
	}
}