import java.util.*;
import java.lang.*;

@FunctionalInterface
interface mylambda
{
	public void add(int x,int y);
}

public class lambdademo3
{
	public static void main(String args[])
	{
		mylambda m = (a,b)->{System.out.println(a+b);};
		m.add(10,20);
	}
}