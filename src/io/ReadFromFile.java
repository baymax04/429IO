package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("f:\\t.txt");
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader reader=new BufferedReader(isr);
		try {
			while(reader.ready()){
				String string=reader.readLine();
				System.out.println(string);
			}
			reader.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
