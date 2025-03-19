import java.util.*;
import java.lang.*;

class array11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        a[0] = 3; a[1] = 9; a[2] = 7; a[3] = 8; a[4] = 12; a[5] = 6;
        int n = 6;
        
        // Print the original array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
        
        int index = 2; // Index of the element to be deleted
        
        // Shift elements to the left to fill the gap
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--; // Decrease the size of the array
        
        // Print the array after deletion
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
    }
}
