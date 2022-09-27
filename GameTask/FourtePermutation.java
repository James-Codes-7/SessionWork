package taskgame;

import java.util.ArrayList;

public class FourtePermutation {

	static ArrayList<Integer[]> arrayPermutationList=new ArrayList<>();
	public static void arrayPermutation(int arr[],int i,int j)
	{
		Integer[] samList;
		if(i==j)
		{
			samList=new Integer[4];
			for(int k=0;k<4;k++)
			{
				
				samList[k]=arr[k];
				
			}			
			arrayPermutationList.add(samList);
		}
		else
		{
			for(int m=i;m<=j;m++)
			{
				swap(arr,i,m);
			    arrayPermutation(arr, i+1,j);
			  swap(arr,i,m);
			}
		}
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static ArrayList<Integer[]> getArrayList() {
		
		return arrayPermutationList;
	}
	
}
