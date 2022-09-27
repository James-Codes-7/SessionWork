package taskgame;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FourteReverse {
	static ArrayList<String> expressList=new ArrayList<>();
	static ArrayList<Integer[]> arrayList=new ArrayList<>();

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		gamePage();

	}
	public static void gamePage()
	{
		System.out.println("Enter the Output Number");
		int Output=scan.nextInt();
		int size=4;
		int input=0;
		boolean bool=false;
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
		System.out.println("Enter the four number");
		for(int i=0;i<size;i++)
		{
			input=scan.nextInt();
			if(input>9||input<1)
			{
				System.out.println("Re enter");
				i--;continue;
			}
			bool=hashSet.add(input);
			if(bool==false)
			{
				i--;
				System.out.println("Don't put dublicate");continue;
			}
			System.out.println((i+1)+" is gotted");
		}
		System.out.println("Number getted successFully");
		ArrayList<Integer> dublicateList=new ArrayList<>(hashSet);


		int inputArray[]=new int[size];
		for(int i=0;i<size;i++)
		{
			inputArray[i]=dublicateList.get(i);
		}


		FourtePermutation.arrayPermutation(inputArray, 0, size-1);
		arrayList=FourtePermutation.getArrayList();
		String arr[]= {"+++","---","***","+-*","+-+","*-*","-+-","-*-","*+*","-+-"};
		int turn=0;
		for(int iter=0;iter<arr.length;iter++)
		{
			expression(arr[iter]);
			turn=FourteAdditional.checkExpressionList(expressList,arrayList,Output);
			if(turn==1)return;
		}




	}
	public static void expression(String expression)
	{
		int i=0;

		String symbol=expression;
		i=0;int j=symbol.length()-1;
		permutations(symbol,i,j);
	}
	public static void permutations(String symbol,int start,int end)
	{
		if(start==end)
		{

			expressList.add((String)symbol);
		}
		else
		{
			for(int j=start;j<=end;j++)
			{
				symbol=swap(symbol,start,j);
				permutations(symbol, start+1, end);
				symbol=swap(symbol, start, j);
			}
		}
	}
	public static String swap(String exp,int left,int right)
	{
		char chararray[]=exp.toCharArray();
		char temp=chararray[left];
		chararray[left]=chararray[right];
		chararray[right]=temp;

		exp=String.valueOf(chararray);
		return  exp;
	}

}
