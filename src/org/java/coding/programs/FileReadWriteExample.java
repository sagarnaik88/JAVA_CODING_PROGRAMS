package org.java.coding.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File readFile = new File("E:\\MyWorkspace\\Mars\\JAVA_CODING_PROGRAMS\\FileOperation\\Read File.txt");
		File writeFile = new File("E:\\MyWorkspace\\Mars\\JAVA_CODING_PROGRAMS\\FileOperation\\Write File.txt");
		
		try {
			FileInputStream fis = new FileInputStream(readFile);
			FileOutputStream fos = new FileOutputStream(writeFile);
			
			int count;
			
			while ((count = fis.read()) != -1){
				 fos.write(count);				
			}
			fis.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
