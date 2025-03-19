import java.util.*;
import java.lang.*;

class method1

{
	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String args[]) {
		method1 sc = new method1();
		int a = 20, b = 30;
		int ans = sc.add(a, b);
		System.out.println("Sum of a+b is : " + ans);
	}
}