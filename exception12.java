import java.util.*;
import java.lang.*;

class stackoverflow extends Exception
{
	public String toString()
	{
		return "Stack is full";
	}
}

class stackunderflow extends Exception
{
	public String toString()
	{
		return "Stack is empty";
	}	
}

class stack
{
	private int size;
	private int top=-1;
	private int s[];

	public stack(int a)
	{
		size=a;
		s = new int[a];
	}

	public void push(int x) throws stackoverflow
	{
		if(top==size-1)
		{
			throw new stackoverflow();
		}
		else
		{
			top++;
			s[top]=x;
		}

	}

	public int pop() throws stackunderflow
	{
		int x=-1;
		if(top==-1)
			throw new stackunderflow();
		x=s[top];
		top--;
		return x;
	}
}

public class exception12
{
	public static void main(String args[])
	{
		stack st = new stack(5);
		try
		{
			st.push(10);
			st.pop();
			st.pop();

		}
		catch(stackoverflow e)
		{
			System.out.println(e);
		}
		catch(stackunderflow e)
		{
			System.out.println(e);
		}
	}
}