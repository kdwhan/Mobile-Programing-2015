package kr.ac.kookmin.exception.fileio;

import java.io.*;

public class AddLineNumber {
	public static void main(String[] args) {
		String path = AddLineNumber.class.getResource("").getPath();
		String s;
		System.out.println(path);
		
		try
		{
			BufferedReader inputStream = 
					new BufferedReader(new FileReader(path+"original.txt"));
			PrintWriter outputStream =
					new PrintWriter(new FileOutputStream(path+"numbered.txt"));
			

			int i=1;
			while((s = inputStream.readLine()) != null)
			{
				outputStream.write(i+s);
				outputStream.println();
				
				System.out.println(i+s);
				i++;
			}
			
			inputStream.close();
			outputStream.close();
		}
		catch(Exception e)
		{
			System.out.println("File is empty");
		}

	}

}
