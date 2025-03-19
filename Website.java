import java.util.*;
import java.lang.*;

class Website
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Website name (type and protocol used):  ");
			String w = sc.nextLine();
			w = w.trim();
			int l = w.indexOf(":");
			int k = w.lastIndexOf(".");
			int len = w.length() ;
			String p = w.substring(0,l) ;
			String z = w.substring(k,len);
			int i,j;
			i = w.indexOf(".");
			j= w.lastIndexOf(".");
			String username = w.substring(i+1,j);
			System.out.println("protocol used is " +p);
			System.out.println("Domain used is " +z);
			System.out.println("Website name is " +username);
			

		}
}