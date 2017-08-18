package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ArrToMatrix {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader br=new BufferedReader(new FileReader("a.txt"));
			String line=null;
			String[] str=null;
			int a=0,b=0;
			String c=null;
			String[][] arr=new String[7][5];
			
			File f=new File("f:\\jing\\test");
			f.mkdirs();
			File file=new File(f.getAbsolutePath(),"result.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);
			while((line=br.readLine())!=null){
				line=line.trim();
				str=line.split(" ");
				pw.write(line+"\r\n");
				for(int i=0;i<str.length;i++){
					a=Integer.parseInt(str[i]);
					if (i==1) {
						c=str[++i];
						arr[b][a]=c;
						pw.write(arr[b][a]+"\r\n");
					}
//					pw.write("\r\n");
					b=a;
				}
			}
			
			for(int m=0;m<arr.length;m++){
				for(int n=0;n<arr[m].length;n++){
					if (arr[m][n]==null) {
						arr[m][n]="0";
					}
					pw.write(arr[m][n]+" ");
				}
				pw.write("\r\n");
			}
			pw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
