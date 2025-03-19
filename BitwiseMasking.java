import java.lang.*;
import java.util.*;

class BitwiseMasking
{ 
public static void main(String args[])
{ 
byte a=9;
byte b=12;
byte c;
System.out.println(a);
System.out.println(b);
c = (byte)(a<<4);
c = (byte)(c|b);
System.out.println((c&0b11110000)>>4);
System.out.println("printing value of b inside c: "+ (c&0b00001111) );
}
}