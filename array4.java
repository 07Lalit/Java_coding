import java.util.*;
import java.lang.*;

class array4
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
		int Max=arr[0];
		int SMax=arr[0];
		
		for(int i=0; i<arr.length ;i++)
		{
			if ( arr[i]>Max)
			{
				SMax = Max;
				Max=arr[i];
			}
			else if ( arr[i]>SMax)
			{
				SMax=arr[i];
			}
			
		}
		
		System.out.println("Maximum Element in array is : "+Max);
		System.out.println("Second Maximum Element in array is : "+SMax);
		
		
	}
}