import java.util.*;
import java.lang.*;

public class math
{
	public static void main(String args[])
	{
		System.out.println("Absolute value: +Math.abs(-123)");
		System.out.println("Absolute: +StrictMath.abs(-123)");

		System.out.println("Cube root: "+Math.cbrt(27));

	/*	System.out.print("Exact decdrement: ");
		System.out.println(Math.decrementExact(Integer.MIN_VALUE));

	int i = Integer.MIN_VALUE;
	i--;
	System.out.println(i);
	*/
	System.out.print("Exponent value in floating point rep : ");
	System.out.println(Math.getExponent(12.3456)); 
	
	System.out.println("Round Division: "+Math.floorDiv(50,9));

	System.out.println("log base 10: "+Math.log10(100));

	System.out.println("Maximum : "+Math.max(100,50));

	System.out.println("Tan :  "+Math.tan(45*Math.PI/180));

	System.out.println("Convert to radians: "+Math.toRadians(90));

	System.out.println("convert to degree: "+ Math.toDegrees(Math.atan(1)));

	System.out.println("Random value: "+Math.random()*100);
	
	System.out.println("Power: "+Math.pow(2,3));

	System.out.println("Exact product: "+Math.multiplyExact(100,200));

	System.out.println("Next Float Value: "+Math.nextAfter(12.3,13));

	
	}
}