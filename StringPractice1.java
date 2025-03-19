import java.lang.*;
import java.util.*;

class StringPractice1
{
public static void main(String args[])
{
String s = "   I am Learning Java ";
String str = s.trim() ;
System.out.println("Original string s is: "+s);
System.out.println("length of String str is : " + str.length() );
System.out.println("String in lowercase is : " + str.toLowerCase() );
System.out.println("String in Uppercase is : " + str.toUpperCase() );
System.out.println("substring of string : " + str.substring(5,13) );
System.out.println("replace the char a to b in string: " + str.replace('a','b') );
}
}