package arrays;

import java.util.Scanner;

public class RotateArray {

	static Scanner scan =new Scanner(System.in);
	public static void leftRotate(int arr[],int time) {
		int j=0;
		for(int i=0;i<time;i++)
		{
			int temp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}

	}
	public static  void rightRoatate(int arr[],int times) {

		int i=0,j=0;

		for(i=0;i<times;i++)
		{
			int temp=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}

	}
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],dElements=0,i=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the how many time ");
		dElements=scan.nextInt();
		if(dElements!=size)
		{
			leftRotate(arr,dElements);
			System.out.println("After the left Roatate");
			for(i=0;i<size;i++) System.out.print(arr[i]+" ");
			rightRoatate(arr,dElements);
			System.out.println();
			System.out.println("After the Right Roatate");
		}
		for(i=0;i<size;i++) System.out.print(arr[i]+" ");

	}
	//Left Rotate and Right Rotate
//	Enter the array size
//	9
//	Enter the elements to the array
//	1 2 3 4 5 6 7 8 9
//	Enter the how many time 
//	5
//	After the left Roatate
//	6 7 8 9 1 2 3 4 5 
//	After the Right Roatate
//	1 2 3 4 5 6 7 8 9 

}
