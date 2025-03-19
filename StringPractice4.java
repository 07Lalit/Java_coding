import java.util.*;
import java.lang.*;

class StringPractice4
{
public static void main(String args[])
{
String str1 = "Pyramid" ;
String str2 = "Pyramid" ;
String str3 = "pyramid" ;
String str4 = "The great wall of china" ;
System.out.println(str1.equals(str2));
System.out.println(str3.equals(str2));
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str3.equalsIgnoreCase(str2));
System.out.println(str1==str2);
System.out.println(str3==str1);
System.out.println(str1.compareTo(str2));
System.out.println(str3.compareTo(str2));
System.out.println(str1.compareTo(str4));
System.out.println(str4.contains("wall"));
}
}