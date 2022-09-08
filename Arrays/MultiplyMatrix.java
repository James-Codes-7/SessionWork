package arrays;

import java.util.Scanner;

public class MultiplyMatrix {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the first matrix row and column");
		int row1=scan.nextInt(),col1=scan.nextInt();

		int firstMatrix[][]=new int[row1][col1],i=0,j=0,k=0;
		System.out.println("Enter the elements to the first matrix");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				firstMatrix[i][j]=scan.nextInt();
			}
		}

		System.out.println("Enter the second matrix row and column");
		int row2=scan.nextInt(),col2=scan.nextInt();
		if(col1!=row2) {
			System.out.println("Cannot multiply");return;
		}
		int secondMatrix[][]=new int[row2][col2];

		System.out.println("enter the elements to the second matrix");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				secondMatrix[i][j]=scan.nextInt();
			}
		}

		int matrixMultiply[][]=new int[row1][col2];
		//Matrix multiply
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				for(k=0;k<col1;k++)
				{
					matrixMultiply[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
				}
			}
		}
		System.out.println();
		//Display the multiply matrix
		System.out.println("Matrix multiply");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(matrixMultiply[i][j]+" ");
			}
			System.out.println();
		}
	}
	//	Enter the first matrix row and column
	//	2 2
	//	Enter the elements to the first matrix
	//	1 2
	//	3 4
	//	Enter the second matrix row and column
	//	2 3
	//	enter the elements to the second matrix
	//	5 6 7
	//	8 9 10
	//
	//	Matrix multiply
	//	21 24 27 
	//	47 54 61 
}
