package keyvalue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class ListExtend {


	static boolean iterate=true;
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		LinkedHashMap<String,String[]>  thirdPage=new LinkedHashMap<>();
		LinkedHashMap<String,String[]>  secondPage=new LinkedHashMap<>();
		LinkedHashMap<String,String[]> start=new LinkedHashMap<>();
		
		
		
		String[] NCERT=new String[6];
		NCERT[0]="NCERT solution for 12";
		NCERT[1]="NCERT solution for 11";
		NCERT[2]="NCERT solution for 10";
		NCERT[3]="NCERT solution for 9";
		NCERT[4]="NCERT solution for 8";
		NCERT[5]="NCERT solution for 7";
		thirdPage.put("NCERT Solution",NCERT);
		
		
		
		String[] clas=new String[5];
		clas[0]="class 12";
		clas[1]="class 11";
		clas[2]="class 10";
		clas[3]="class 11";
		clas[4]="class 10";
		thirdPage.put("class", clas);
		
		
		
		String[] cbse=new String[5];
		cbse[0]="Physics";
		cbse[1]="chemistry";
		cbse[2]="Maths";
		cbse[3]="English";
		cbse[4]="biology";
		thirdPage.put("CBSE", cbse);
		
		
		String[] calculater=new String[3];
		calculater[0]="basic calculater";
		calculater[1]="physics clasculater";
		calculater[2]="chemistry calculater";
		thirdPage.put("Calculater", calculater);

		
		String[] stydyMaterials=new String[4];
		stydyMaterials[0]="NCERT Solution";
		stydyMaterials[1]="Class";
		stydyMaterials[2]="CBSE";
		stydyMaterials[3]="Calculater";
		
		
		String[] scholorship=new String[4];
		scholorship[0]="BST class 4-10";
		scholorship[1]="BNAT class 11-10";
		scholorship[2]="BNST|IAS";
		scholorship[3]="MOCKTEST|JEE";
		
		

		String []byju=new String[2];
		byju[0]="Study Materials";
		byju[1]="ScholorShip";
		
		
		secondPage.put("Study Materials", stydyMaterials);
		secondPage.put("ScholorShip",scholorship );
		
		
		start.put("Byjus",byju);
		
		System.out.println("Welcome to Byjus.com");
		System.out.println();
		Set<String> firstKey=start.keySet();
		Set<String> secondKey=secondPage.keySet();
		Set<String> thirdKey=thirdPage.keySet();

		int i=0;
		for(String firstKeyIterate:firstKey)
		{
			while(i<start.get(firstKeyIterate).length)
			{
				
				System.out.println("\t"+start.get(firstKeyIterate)[i]+"\t");
				
				System.out.println("View Its Features  Press 1");
				int dub=scan.nextInt();
				if(dub==1)
				{
					for(String secondKeyIterate:secondKey)
					{
						System.out.println();
						if(start.get(firstKeyIterate)[i].equalsIgnoreCase(secondKeyIterate))
						{
							for(int j=0;j<secondPage.get(secondKeyIterate).length;j++)
							{
								System.out.println(secondPage.get(secondKeyIterate)[j]);
								System.out.println();
								System.out.println("View its Featurs Press 1");
								int option=scan.nextInt();
								if(option==1)
								{
									for(String thirdKeyIterate:thirdKey)
									{
										if(secondPage.get(secondKeyIterate)[j].equalsIgnoreCase(thirdKeyIterate))
										{
											for(int k=0;k<thirdPage.get(thirdKeyIterate).length;k++)
											{
												System.out.println(thirdPage.get(thirdKeyIterate)[k]);
											}
										}
									}
								}
								System.out.println();
							}

						}
					}
				}

				i++;
			}
		}


	}

}
