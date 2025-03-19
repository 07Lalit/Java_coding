interface mylambda
{
	public void display(String str);
}

public class lambdademo6
{
	public static void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.err.println(sb);
	}

	public static void main(String args[])
	{
		mylambda ml = lambdademo6::reverse;

		ml.display("Hello");
	}
}