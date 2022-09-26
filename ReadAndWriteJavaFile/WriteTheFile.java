package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteTheFile {

	public void readAndWrite()
	{
		int countCharacters=0,countLines=0;
		String tempCopy="";
		try {
			FileOutputStream copyJavaFile=new FileOutputStream("D:ProgramCopy.java");
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

	public static void main(String[] args) {
		
		WriteTheFile file=new WriteTheFile();
		file.readAndWrite();

	}

}
