package arrays;

import java.util.Scanner;

public class CountGrantChildren {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the name to find grandChildren");
		//The first letter of the name capital
		String grandpaName=scan.next();
		
		String familyList[][]= {{"Luke","Shaw"},
				                {"Wayne","Rooney"},
			                	{"Rooney","Ronaldo"},
			                  	{"Shaw","Rooney"}};
		
		int i=0,count=0,j=0;
		
		while(i<familyList.length)
		{
			if(familyList[i][1].equals(grandpaName))
			{
				for(j=0;j<familyList.length;j++)
				{
					if(familyList[j][1].equals(familyList[i][0]))
					{
						count++;
					}
				}
				
			}
			i++;
		}
		System.out.println("The total grandchildrens:"+count);

	}
//  Output:
//	Enter the name to find grandChildren
//	Ronaldo
//	The total grandchildrens:2
}
