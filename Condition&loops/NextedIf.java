package control;

import java.util.Scanner;

public class NextedIf {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int number=scan.nextInt();

		if(number<100)
		{
			if(number<90)
			{
				if(number<80)
				{
					if(number<70)
					{
						if(number<60)
						{
							if(number<50)
							{
								System.out.println("The number is lessthan 50");
							}
							else
							{
								System.out.println("The number between 50-59");
							}
						}
						else
						{
							System.out.println("The number between 60-69");
						}
					}
					else
					{
						System.out.println("The number between 70-79");
					}
				}
				else
				{
					System.out.println("The number between 80-89");
				}
			}
			else
			{
				System.out.println("The number between 90-99");
			}
		}
		else
		{
			System.out.println("The number is 100 above");
		}
	}

}
