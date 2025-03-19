import java.util.*;
import java.lang.*;

class Bitwise
{
public static void main(String args[])
{
int x=0b1010;
int y=0b0110;
int z;
int k,l,m;

z = x&y ;
k = x|y;
l= x<<1;
m= x>>1;
int u = 0b1010;
System.out.println(z);
System.out.println(k);
System.out.println(l);
System.out.println(m);
System.out.println(String.format("%s",Integer.toBinaryString(u)));


}
}