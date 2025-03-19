import java.util.*;
import java.lang.*;

class wrapperdemo2
{	
	public static void main(String args[])
	{
		int cc=20;
		//Integer i = new Integer(cc);
		Integer a = Integer.valueOf(10);
		Integer b = 10;

		Byte c = 15;
		Byte d = Byte.valueOf("15");
		byte bb = 15;
		Byte e = Byte.valueOf(bb);

		Short f = Short.valueOf("123");
		Float g = 12.3f;
		Float h = Float.valueOf("123.5");

		Double j = Double.valueOf(123.46);
		
		Character k = Character.valueOf('A');
		
		Boolean l = Boolean.valueOf("true");
		
		System.out.println(cc);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(bb);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
	}
}