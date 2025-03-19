import java.lang.*;
import java.util.*;

class StringPractice2
{
public static void main(String args[])
{
String s = new String("Mr. Sharukh Kahn");
System.out.println("startsWith : " + s.startsWith("Mr") );
System.out.println("startsWith : " + s.startsWith(".") );
System.out.println("endsWith : " + s.endsWith("Kahn") );
System.out.println("endsWith : " + s.endsWith("u") );
System.out.println("charAt : " + s.charAt(7) ) ;
System.out.println("indexOf : " + s.indexOf(".") );
System.out.println("indexOf : " + s.indexOf("z") );
System.out.println("lastIndexOf : " + s.lastIndexOf("a") );
}
}