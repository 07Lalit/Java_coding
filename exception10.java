import java.util.*;
import java.lang.*;

public class exception10
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Final message.");
		}
	}
}
