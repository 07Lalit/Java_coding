import java.util.*;
import java.lang.*;

class RegularExpression1
{
public static void main(String args[])
{
	
	String str1= "lalit11@gmail.com";
	String str2= "lalit11@google.com";
	System.out.println(str1.matches("(.*)@gmail(.*)"));
	System.out.println(str2.matches("(.*)@gmail(.*)"));
	
	int in = str2.lastIndexOf("@");
   String username = str2.substring(0,in);
	String domainame = str2.substring(in+1,str2.length());
	System.out.println(in);
	System.out.println(username);
	System.out.println(domainame);
}
}