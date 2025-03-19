import java.util.*;
import java.lang.*;

class my implements Runnable
{
	public void run()
	{

	}
}

public class multithreading6
{
	public static void main(String args[]) throws Exception
	{
		
		Thread t= new Thread(new my(),"My Name");
		 we have pass the object of my class and the name as constructor parameter 

		

	}

}