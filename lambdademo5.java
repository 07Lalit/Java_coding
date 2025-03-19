interface mylambda
{
	public void display(String str);
}

public class lambdademo5
{
	public static void main(String args[])
	{
		mylambda ml = System.out::println;
		ml.display("Hello");
	}
}