import java.lang.*;
import java.util.*;

class BitwiseSwap
{
public static void main(String args[])
{
int a;
int b;
System.out.println("Enter two number a & b");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Numbers before swapping"+"\na:"+a+"\nb:"+b);
a= a^b;
b= a^b;
a= a^b;
System.out.println("Number after swapping"+"\na:"+a+"\nb:"+b);
}
}