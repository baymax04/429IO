package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText2 {

	public static void main(String[] args) throws IOException {
		//¶ÁÈ¡ÎÄ¼þ
		BufferedReader br=new BufferedReader(new FileReader("src\\io\\b.txt"));
		String line=br.readLine();
		int cnt=0;
		int i=0,j=0,k=0;
		while(line!=null){
			String[] numbers=line.split(" ");
			i=Integer.parseInt(numbers[0]);
			j=Integer.parseInt(numbers[1]);
			
		}
		
		
		br.close();
		
	}

}
