package arrays;

import java.util.Scanner;

public class Xpattern {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String patternStr=scan.next();
		if(patternStr.length()%2==0)
		{
			System.out.println("0");return;
		}
		int i=0,j=0;
		for(i=0;i<patternStr.length();i++)
		{
			for(j=0;j<patternStr.length();j++)
			{
				if(i==j||i+j==patternStr.length()-1)
				{
					System.out.print(patternStr.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
//	Enter the String
//	PROGRAM
//	P     M
//	 R   A 
//	  O R  
//	   G   
//	  O R  
//	 R   A 
//	P     M
}
