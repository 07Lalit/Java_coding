interface mylambda
{
	public void display();
}

class uselambda
{
	public void calllambda(mylambda m1)
	{
		m1.display();
	}
}

/*class Demo
{
	public void method1()
	{
		MyLambda m1=()->{
			int count=0
			System.out.println("hi");
			System.out.println("byee");
			System.out.println(count);
		};
		
		m1.display();
	}
}*/

class Demo
{
	public void method1()
	{
		uselambda ul = new uselambda();
		ul.calllambda(()->{System.out.println("Hello");});
	}
}
public class lambdademo4
{
	public static void main(String args[])
	{
		Demo d= new Demo();
		d.method1();
	}
}