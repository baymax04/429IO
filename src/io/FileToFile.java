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

		//��ָ���ļ���ȡ���ݣ�����һ��ָ���ļ�
		File rfile=new File("f:\\t.txt");
		FileInputStream fis=new FileInputStream(rfile);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader reader=new BufferedReader(isr);//�������������ļ������������ݾ����ܽ�����������
			
		//ָ���ļ���+�ļ��������ļ���+�ļ�
		File f1=new File("f://test3//");
		f1.mkdirs();
		File file=new File(f1.getAbsolutePath(),"t3.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		
		PrintWriter pWriter=null;
		try {
			pWriter=new PrintWriter(file);//����t3.txt�ļ���һ�������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//���� + ��־
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
