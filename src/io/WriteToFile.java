package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("f://test//t.txt");
		FileOutputStream fos=new FileOutputStream(file);
		OutputStreamWriter writer=new OutputStreamWriter(fos);
		writer.append("����\r\n");
		writer.append("������");
		writer.close();
		fos.close();
	}

}
