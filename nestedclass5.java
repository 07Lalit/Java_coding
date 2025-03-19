import java.util.*;
import java.lang.*;

interface my
{
	void display();
}

public class nestedclass5
{
	public static void main(String args[])
	{
		my m = new my()
			{
				public void display()
				{
					System.out.println("Hello bhai..");
				}		
			};
		m.display();
	}
}