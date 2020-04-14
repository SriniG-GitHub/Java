package coreJavaPrograms;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingNotepadTextFile {

	public static void main(String[] args) throws IOException {
		//Reading data from text file.
		
		File f = new File("Files\\ReadingNotepadTextFile_Data.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int ch=0;
		while((ch=bis.read())!=-1) {
			System.out.print((char)ch);
		}
bis.close();
fis.close();
	}

}
