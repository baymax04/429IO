package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1=new File("f://test1//");
		f1.mkdirs();
		File file=new File(f1.getAbsolutePath(),"t2.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pWriter=new PrintWriter(file);
		pWriter.append("哈哈");
		pWriter.append("/** 计算器左边的M的显示名字 */"+
	"private final String[] M = { '', 'MC', 'MR', 'MS', 'M+' };");
		pWriter.append("jjjj\r\n");
		pWriter.close();
		
		
		
		
	}

}
