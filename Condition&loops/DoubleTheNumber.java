package control;

import java.util.Scanner;

public class DoubleTheNumber {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		System.out.println("Enter the number of times");
		int times=scan.nextInt(),temp=1;
		while(true)
		{
			if(temp==times)
			{
				System.out.println("Output:"+number);break;		
			}
			number+=number;
			temp++;
		}

	}

}
