package arrays;

import java.util.Scanner;

public class SumOfWeights {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arrWeight[]=new int[size],arrSum[]=new int[size];
		int i=0,sum=0,j=0,temp1,temp2=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arrWeight[i]=scan.nextInt();
		}

		//Find sum of Weight
		for(i=0;i<size;i++)
		{
			int sqr=(int)Math.sqrt(arrWeight[i]);
			if(sqr*sqr==arrWeight[i]) sum+=5;
			if(arrWeight[i]%4==0&&arrWeight[i]%6==0) sum+=4;
			if(arrWeight[i]%2==0) sum+=3;
			arrSum[i]=sum;
			sum=0;
		}
		//Alter based on weight
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arrSum[i]<arrSum[j])
				{
					//Swap based on weight
					temp1=arrSum[i];arrSum[i]=arrSum[j];arrSum[j]=temp1;
					temp2=arrWeight[i];arrWeight[i]=arrWeight[j];arrWeight[j]=temp2;
				}
			}
		}
		System.out.println("The Output:<Number, weightage>");
		System.out.println();
		for(i=0;i<size;i++)
		{
			System.out.print("<"+arrWeight[i]+","+arrSum[i]+"> ");
		}
	}
	//	Enter the array size
	//	5
	//	Enter the elements to the array
	//	49 36 8 10 12
	//	The Output:<Number, weightage>
	//
	//	<36,12> <12,7> <49,5> <10,3> <8,3> 
}
