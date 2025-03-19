import java.util.*;
import java.lang.*;

class array2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter elements in array arr: ");
     	int u ;
		for(int i=0; i<arr.length ;i++)
		{
			System.out.print("Element at index "+i+" is : ");
			u = sc.nextInt();
			arr[i] = u ;
			
		}

		System.out.println(" ");
		int sum = 0;
		for(int i=0; i<arr.length ;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements is : "+sum);
	}
}