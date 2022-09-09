package arrays;

import java.util.Scanner;

public class MatrixSpiralForm {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the matrix row and column");
		int row=scan.nextInt(),col=scan.nextInt();

		int matrix[][]=new int[row][col],i=0,j=0,x=0,y=0;
		System.out.println("Enter the elements to the matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}

		System.out.println("Spiral form of matrix");
		for(i=0;i<=row/2;i++)
		{
			j=i;
			//left to right
			for(x=i,y=j;y<col-i;y++)
			{
				System.out.print(matrix[x][y]+" ");
			}
			//right to down
			for(x=col-1-i,y=i+1;y<row-i;y++)
			{
				System.out.print(matrix[y][x]+" ");
			}
			//downright to  down left
			for(x=row-1-i,y=col-i-2;y>=i;y--)
			{
				System.out.print(matrix[x][y]+" ");
			}
			//down to up
			for(x=row-i-2,y=i;x>i;x--)
			{
				System.out.print(matrix[x][y]+" ");
			}
		}



	}
	//	Enter the matrix row and column
	//	4 4
	//	Enter the elements to the matrix
	//	1 2 3 4
	//	5 6 7 8
	//	9 10 11 12
	//	13 14 15 16
	//	Spiral form of matrix
	//	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
}
