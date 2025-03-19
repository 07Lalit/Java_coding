import java.util.*;
import java.lang.*;

class array3
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

		System.out.print("\n Enter a element you want to search in array arr: ");
		int s = sc.nextInt();
		System.out.println(" ");
		int c=0;
		for(int i=0; i<arr.length ;i++)
		{
			if (arr[i]==s)
			{
				System.out.println("Search element at index "+i+" in arr ");
				System.exit(0);
				c=1;
			}
		}
	
	
		System.out.println("elements is not present in array arr.");
		
	}
}