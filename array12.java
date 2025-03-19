import java.util.*;
import java.lang.*;

class array12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int b[] = new int[10];
        
       
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] ;
        }
        System.out.print("Printing array a:  ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");

			System.out.print("Printing array b:  ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println("");
    }
}