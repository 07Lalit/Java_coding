import java.util.*;
import java.lang.*;

class RegularExpression2
{
public static void main(String args[])
{
	int b = 1000110;
	String str1=  String.valueOf(b);
	
	System.out.println(str1.matches("[01]+"));

	
   String str2 = "234AB";
	System.out.println(str2);
	System.out.println(str2.matches("[0-9A-F]+"));

	String str3= "01/12/2000";
	String str4 = "07/09/2002";
	System.out.println(str3);
	System.out.println(str3.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"));
	System.out.println(str4.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"));

	String str5= "a!@bcd#$y%u&*(IT)BYEE";
	String str6 = "La lit Go u r hi i ar e you  ";
	System.out.println(str5);
	System.out.println(str5.replaceAll("[^A-Za-z0-9]",""));
	System.out.println(str6);
	System.out.println(str6.replaceAll("[\\s]",""));
 String str7="  Hello I am Lalit  ";
 int i = str7.length();
System.out.println(str7);
System.out.println(i);
System.out.println(str7.trim());
String str8 = str7.trim();
System.out.println(str8.length());
int cnt=0;
for(int j=0 ; j<str8.length(); j++)
	{
	 if (str8.charAt(j)==' ')
		{
			cnt++;
		}

	}
System.out.println("Num of words in string is: " + (cnt+1) ) ;	
}
}