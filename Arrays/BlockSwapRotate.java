package arrays;

import java.util.Scanner;

public class BlockSwapRotate {

	static Scanner scan=new Scanner(System.in);
	public static  void swap(int arr[],int start,int end,int  rotate) {
		
		for(int i=0;i<rotate;i++)
		{
			int temp=arr[start+i];
			arr[start+i]=arr[end+i];
			arr[end+i]=temp;
		}

	}
	private static  void blockSwap(int arr[],int size,int rotate) {
		
		int startPoint=rotate;
		int endPoint=size-rotate;
		
		while(startPoint!=endPoint)
		{
			if(startPoint<endPoint)
			{
				swap(arr,rotate-startPoint,rotate+endPoint-startPoint,startPoint);
				endPoint-=startPoint;
			}
			else
			{
				swap(arr,rotate-startPoint,rotate,endPoint);
				startPoint-=endPoint;
			}
		}
		swap(arr, rotate-startPoint, rotate, startPoint);
		

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
		System.out.println("Enter the target rotations");
		int rotations=scan.nextInt();
		blockSwap(arr,size,rotations);
		System.out.println("The Rotate array is");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
//	Enter the array size
//	6
//	Enter the elements to the array
//	1 2 3 4 5 6 
//	Enter the target rotations
//	4
//	The Rotate array is
//	5 6 1 2 3 4 
}
