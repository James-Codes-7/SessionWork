package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_2 {

	public static void main(String[] args) throws IOException {
		int countCharacters=0,countLines=0;
		String tempCopy="";
		try {
			FileOutputStream copyJavaFile=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Sample\\src\\"
					+ "filehandling\\File_4.java");
			FileInputStream  readJavaFile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace"
					+ "\\Sample\\src\\filehandling\\File_2.java");
			int character;
			while((character=readJavaFile.read())!=-1)
			{
				countCharacters++;
				if((char)character=='\n')
				{
					countLines++;
				}
				
				tempCopy+=(char)character;
				System.out.print((char)character);
			}
			byte[] convertByteArray = tempCopy.getBytes();
			copyJavaFile.write(convertByteArray);
			copyJavaFile.close();
			readJavaFile.close();
			System.out.println();
			System.out.println(countCharacters);
			System.out.println(countLines);
		}
		catch(Exception e)
		{
			System.out.println("Not");
		}


	}

}
