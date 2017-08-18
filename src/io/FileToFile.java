package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//从指定文件读取内容，到另一个指定文件
		File rfile=new File("f:\\t.txt");
		FileInputStream fis=new FileInputStream(rfile);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader reader=new BufferedReader(isr);//缓存输入流把文件输入流的内容尽可能将缓存流塞满
			
		//指定文件夹+文件，创建文件夹+文件
		File f1=new File("f://test3//");
		f1.mkdirs();
		File file=new File(f1.getAbsolutePath(),"t3.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		
		PrintWriter pWriter=null;
		try {
			pWriter=new PrintWriter(file);//生成t3.txt文件的一个输出流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//内容 + 标志
		String content=null;
		String mark="end";
		
		try {
			while((content=reader.readLine())!=null){
				if (content.equalsIgnoreCase(mark)) {
					break;
				}
				pWriter.write(content+"\r\n");
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
