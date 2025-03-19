import java.util.*;
import java.lang.*;

interface Member
{
	public void callback();
}

class store 
{
	Member members[] = new Member[100];
	int count =0;

	public void register(Member m)
	{
		members[count++] = m;
		
	}

	public void invitesale()
	{
		for(int i=0;i<count;i++)
		{
			members[i].callback();
		}
	}

}

class customer implements Member
{
	public String name;
	
	public customer(String n)
	{
		name = n;
	}
		
	public void callback()
	{
		System.out.println("Okay! I will visit "+name);
	}
	
}

public class Interface3
{
	public static void main(String args[])
	{
		store s = new store();
		customer c1 = new customer("John");
		customer c2 = new customer("Lalit");
		s.register(c1);
		s.register(c2);
		s.invitesale();
	}
}