package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data2Array test=new Data2Array();
		String[][] array=test.parse();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if (array[i][j].equals(0)) {
					System.out.print(" " );
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	private String[][] parse() {
		// TODO Auto-generated method stub
		String[][] result=new String[10][10];
		try {
			File file=new File("f:/data.txt");
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader reader=new BufferedReader(isr);

			int cnt=0;
			String line;
			
			while((line=reader.readLine())!=null){
				result[cnt]=parseLine(line);
				cnt++;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	private String[] parseLine(String line) {
		// TODO Auto-generated method stub
		String[] nums=line.split(" ");
		return nums;
	}
	
	
	

}
