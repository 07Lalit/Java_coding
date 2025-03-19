import java.util.*;
import java.lang.*;

class array5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]={1,2,3,4,5,6} ;
		System.out.println("Left Rotate: ");
		System.out.print("Enter number of left shift you want : ");
		int left = sc.nextInt();
		sc.nextLine();
		int l = arr.length ;
		int temp;
		for(int i=1; i<=left ;i++)
		{  
			System.out.print("\nShifting the element "+i+" time: ");
			temp = arr[0];
			for(int j=0; j<arr.length-1 ;j++)
				{
					arr[j]=arr[j+1];
			
				}
			arr[l-1] = temp;
			System.out.print("[");
			for(int j=0; j<arr.length;j++)
				{
					if (j==arr.length-1)
						{
							System.out.print(arr[j]+"]");
						}
					else
						{
							System.out.print(arr[j]+",");
						}
			
				}
		}

	
	}
}