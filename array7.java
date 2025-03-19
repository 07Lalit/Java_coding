import java.util.*;
import java.lang.*;

class array7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,-1,-1,-1,-1};
		System.out.println("Inserting element at given index");
		System.out.print("Enter index you want to insert(0-9): : ");
		int idx = sc.nextInt();
		System.out.print("Enter ele you want to insert  : ");
		int ele = sc.nextInt();
		int l = arr.length ;
		int n = 6;
		int ask=1;
		while (n<=10 && ask==1)
		{	
			if (arr[idx]==-1)
			{
				arr[idx]=ele;
			}
			
			for(int i=l-2;i>idx+1;i--)
			{
				arr[i+1] = arr[i];
				
			}
			arr[idx] = ele;
			for(int i=0;i<arr.length;i++)
			{
				System.out.print((arr[i])+",");
			}
        System.out.println(" ");

			System.out.println("If you want to stop press 0 and 1 to continue");
			ask = sc.nextInt();
		}
		if (n>10)
		{
			System.out.println("Array if full");
		}
		else
		{
			System.out.println("Thank You!!");
		}

	}
}