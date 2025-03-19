import java.util.*;
import java.lang.*;

public class langdemo1
{

	public static void main(String args[])
	{
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3=o2;
		
		System.out.println(o1.equals(o2));
		System.out.println(o3.equals(o2));
		
	}
}