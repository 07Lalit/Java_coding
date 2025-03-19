import java.util.*;
import java.lang.*;

class StringPractice5 
{
public static void main(String args[])
{
String str1 ="a";
String str2= "0a";
System.out.println("(only for single character string should has) using . it matches a  string is either a-z,0-9,special symbol : " + str1.matches("."));

System.out.println("(only for single character string should has) using [abc] it matches in the followeing  : " + str1.matches("[abc]"));

System.out.println("(only for single character string should has) using [abc] it matches in the followeing  : " + str2.matches("[Lal][^cde]"));

System.out.println(str1.matches("\\w"));
System.out.println(str1.matches("\\W"));
System.out.println(str1.matches("\\s"));
System.out.println(str1.matches("\\S"));
System.out.println(str1.matches("\\d"));
System.out.println(str1.matches("\\D"));
}
}