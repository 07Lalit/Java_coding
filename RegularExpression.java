import java.util.*;
import java.lang.*;

class RegularExpression
{
public static void main(String args[])
{
	String str1 = "abcabc";
	String str2 = "john@gmail.com";
	String str3 = "lalit11@gmail.com";
	System.out.println(str1.matches(".*"));
	System.out.println(str1.matches("[a-z]*") );

	System.out.println(str1.matches("[abc]+") );

System.out.println(str1.matches("[abc]{3}") );

System.out.println(str1.matches("[abc]{3,7}") );

System.out.println(str2.matches(".*gmail.*"));

System.out.println(str3.matches("\\S*|\\w*@gmail.*"));
System.out.println(str2.matches("\\W*@gmail(.*)"));
}
}