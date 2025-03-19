import java.util.*;
import java.lang.*;

@FunctionalInterface
interface mylambda
{
	public void display(String str);
}

public class lambdademo2
{
	public static void main(String args[])
	{
		mylambda m = (s)->{System.out.println(s);};
		m.display("Hello lalit");
	}
}