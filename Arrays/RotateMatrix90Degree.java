package arrays;

import java.util.Scanner;

public class RotateMatrix90Degree {

	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the row and column of matrix");
		int row=scan.nextInt(),col=scan.nextInt();
		
		int matrix[][]=new int[row][col],i=0,j=0;
		
		System.out.println("Enter the element to the matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("After the matrix rotation by 90 degree");
		for(i=0;i<col;i++)
		{
			for(j=row-1;j>=0;j--)
			{
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
// Output:
//	Enter the row and column of matrix
//	3 3
//	Enter the element to the matrix
//	1 2 3
//	4 5 6
//	7 8 9
//	After the matrix rotation by 90 degree
//	7 4 1 
//	8 5 2 
//	9 6 3 
}
