package taskgame;

import java.util.ArrayList;

public class FourteAdditional {


	public static int checkExpressionList(ArrayList<String> expList,
			ArrayList<Integer[]> arrList,int output)
	{
		int newArray[]=new int[4], expIterate=0,temp=0,sIterate;
		String express="";
		for(int i=0;i<arrList.size();i++)
		{
			newArray=convertArray(arrList.get(i));

			for(int x=0;x<expList.size();x++)
			{
				String getString=expList.get(x);
				temp=newArray[0];
				express+=temp;
				sIterate=0;
				for(int j=1;j<newArray.length;j++)
				{
					char symbol=getString.charAt(sIterate++);
                    express+=symbol;
                    express+=newArray[j];
					if(symbol=='+')temp+=newArray[j];
					if(symbol=='*')temp=temp*newArray[j];
					if(symbol=='-')temp=temp-newArray[j];
				}
				if(temp==output) 
				{
					System.out.println(express);
					System.out.println("Gotted");
					return 1;
				}
				express="";
			}
		}
		return 0;
	}
	public static int[] convertArray(Integer[] intarr)
	{
		int temp[]=new int[4];
		int i=0;
		for(i=0;i<temp.length;i++)
		{
			temp[i]=intarr[i];
		}
		return temp;

	}
}
