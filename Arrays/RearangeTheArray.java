package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearangeTheArray {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int reArrange[]=new int[size],i=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			reArrange[i]=scan.nextInt();
		}
        
		Arrays.sort(reArrange);
		//tempSize for even or odd length of array
		int tempSize=size%2==0?size-1:size;
		System.out.println("Output:");
		//Rearrange the array
		System.out.print(reArrange[tempSize/2]+" ");
		for(i=1;i<=tempSize/2+1;i++)
		{
			 if((tempSize/2+i)<size)//Handle index error
				 System.out.print(reArrange[tempSize/2+i]+" ");
			 if((tempSize/2-i)>=0)//Handle index error
			 {
				 System.out.print(reArrange[tempSize/2-i]+" ");
			 }
		}
	}
//	Enter the array size
//	7
//	Enter the elements to the array
//	1 2 3 4 5 6 7
//	Output:
//	4 5 3 6 2 7 1 
	
//	Enter the array size
//	8
//	Enter the elements to the array
//	1 2 1 4 5 6 8 8 
//	Output:
//	4 5 2 6 1 8 1 8 
}
