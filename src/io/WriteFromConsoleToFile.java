package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFromConsoleToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//键盘输入,并存至缓冲流
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(isr);
		File f1=new File("f://test2//");
		f1.mkdirs();
		File file=new File(f1.getAbsolutePath(),"t2.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pWriter=null;
		try {
			pWriter=new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		//内容 + 标志
		String content=null;
		String mark="end";
		
		try {
			while((content=reader.readLine())!=null){
				if (content.equalsIgnoreCase(mark)) {
					break;
				}
				pWriter.write(content+" ");
				pWriter.flush();
			}
			pWriter.close();
			reader.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
