package arrays;

import java.util.Scanner;

public class ReversalArrayRotation {

	static Scanner scan=new Scanner(System.in);
	public static void reversal(int arr[],int start,int end)
	{
		int k=0,s=0;
		for(k=0;k<(end-start)/2;k++)
		{
			int temp=arr[start+k];
			arr[start+k]=arr[end-1-s];
			arr[end-1-s]=temp;
			s++;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the times to rotation");
		int times=scan.nextInt();
		
		reversal(arr,0,times);
		reversal(arr,times,size);
		reversal(arr,0,size);
		System.out.println("After the rotation using Reversal");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
//Output
//	Enter the array size
//	9
//	Enter the elements to the array
//	1 2 3 4 5 6 7 8 9
//	Enter the times to rotation
//	5
//	After the rotation using Reversal
//	6 7 8 9 1 2 3 4 5 
}
