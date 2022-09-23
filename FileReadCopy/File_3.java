package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class File_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream readJavaFile = new FileInputStream("D:ProgramCopy.java");

		int character,countCharacters=0,countLines=0;
		try
		{
			while((character=readJavaFile.read())!=-1)
			{
				if((char)character=='\n')
				{
					countLines++;
				}
				countCharacters++;
				System.out.print((char)character);
			}
			System.out.println();
			System.out.println(countCharacters);
			System.out.println(countLines);
			readJavaFile.close();
		}
		catch(Exception e)
		{
			System.out.println("Don't get");
		}
	}

}
