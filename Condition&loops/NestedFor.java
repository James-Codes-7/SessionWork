package control;

import java.util.Scanner;

public class NestedFor {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the word");
        String str=scan.next();
        
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		System.out.print(str+" ");
        	}
        	System.out.println();
        }
	}

}
