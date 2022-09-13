package arrays;

import java.util.Scanner;

public class Adjacent {

	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int mat[][]=new int[size][size];
		int i=0,j=0,k=0;
		System.out.println("Enter the elements to the matrix");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		
		int subMat[]=new int[4],outMat[][]=new int[size][size],s=1;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				for(int x=0;x<size;x++)
				{
					for(int y=0;y<size;y++)
					{
						if(x!=i&&y!=j)
						{
							subMat[k++]=mat[x][y];
						}
					}
				}
				if(size>2)outMat[i][j]=s*((subMat[0]*subMat[3])-(subMat[1]*subMat[2]));
				else  outMat[i][j]=s*subMat[k-1];
				k=0;
				s=-s;
			}
		}
		System.out.println("Output");
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				System.out.print(outMat[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
