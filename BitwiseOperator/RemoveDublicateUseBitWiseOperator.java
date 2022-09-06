package bitwise1;

import java.util.Scanner;

public class RemoveDublicateUseBitWiseOperator {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		
		int i=0,j=0,k=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//use XOR operator
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if((arr[i]^arr[j])==0)
				{/*if arr[i]=3,arr[j]=3
				   binary representation of arr[i],arr[j]          a ^ b
				   arr[i]->0 0 1 1                                 0   0 =0  
				   arr[j]->0 0 1 1                                 1   0 =1
				                                                   0   1 =1
				           0 0 0 0->0                              1   1 =0
				        if(0==0) true so remove arr[j]
				*/
					for(k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
					}
					j--;
					size--;
				}
					
			}
		}
		
		System.out.println("The new array");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
/*
Enter the array size
10
Enter the elements to the array
1 2 3 2 4 5 2 1 3 5
The new array
1 2 3 4 5 
 */
}
