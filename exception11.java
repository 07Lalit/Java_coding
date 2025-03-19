import java.util.*;
import java.lang.*;
import java.io.*;

class exception11
{
	static FileInputStream fi;
	static Scanner sc;
	static void divide() throws Exception
	{
		fi=new FileInputStream("C:\\Users\\gourl\\OneDrive\\Desktop\\java\\demo.txt");
		
		try
		{
			sc = new Scanner(fi);

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(a/c);
		}
		finally
		{
			fi.close();
			sc.close();
		}
	}

	public static void main(String args[]) throws Exception
	{
		try
		{
			divide();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//int x = sc.nextInt();
		//System.out.println(x);
	}
}