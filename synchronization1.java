import java.util.*;
import java.lang.*;

class mydata
{
	public void display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		//System.out.print("\n");
	}
}

class mythread1 extends Thread
{
	mydata first ;
	public mythread1(mydata d1)
	{
		this.first=d1;
	}
	public void run()
	{
		first.display("Hello world");
	}
}

class mythread2 extends Thread
{
	mydata sec ;
	public mythread2(mydata d2)
	{
		this.sec=d2;
	}
	public void run()
	{
		sec.display("welcome all");
	}
}

public class synchronization1
{
	public static void main(String args[])
	{
		mydata data = new mydata();
		mythread1 t1 = new mythread1(data);
		mythread2 t2 = new mythread2(data);
		t1.start();
		t2.start();
	}
}