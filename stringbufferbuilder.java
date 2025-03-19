import java.util.*;
import java.lang.*;

public class math
{
	public static void main(String args[])
	{
		System.out.println("Absolute value: +Math.abs(-123)");
		System.out.println("Absolute: +StrictMath.abs(-123)");

		System.out.print("Cube root: "+Math.cbrt(27));

		System.out.print("Exact decdrement: ");
		System.out.println(Math.decrementExact(Integer.MIN_VALUE));

	int i = Integer.MIN_VALUE;
	i--;
	System.out.println(i);

	System.out.print("Exponent value in floating point rep : ");
	System.out.println(Math.getExponent(12.3456));
	}
}