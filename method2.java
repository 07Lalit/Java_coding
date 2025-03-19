import java.util.*;
import java.lang.*;

class method2

{
	static void update(int a[])
		{
			a[2]=100;
		}
	
	static String userName(String email)
		{
			int a = email.indexOf('@');
			String name = email.substring(0,a);
			return name;
		}

	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6};
		for(int x:a)
		{
			System.out.print(x+",");
		}
		System.out.println("");
		update(a);
		for(int x:a)
		{
			System.out.print(x+",");
		}
		System.out.println(" ");
		String str = "lalit11@gmail.com";
		String ans = userName(str);
		System.out.println(ans);
	}
}