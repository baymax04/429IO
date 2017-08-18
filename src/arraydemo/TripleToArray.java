package arraydemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TripleToArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {

			BufferedReader br=new BufferedReader(new FileReader("src\\arraydemo\\data.txt"));
			String line=null;
			String[] str=null;// 该一维数组用于存放每一行的数据
			int a=0,b=0;
			String val=null;
			String[][] arays=new String[6][7];
			
			//用于存放矩阵的文件
			File f=new File("f:\\test\\");
			f.mkdirs();
			File file=new File(f.getAbsolutePath(),"result2.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);//输出流，输出到指定文件
			
			while((line=br.readLine())!=null){
				line=line.trim();
				str=line.split(" ");//数据以空格分割，放到一位数组中
				pw.write(line+"\r\n");
				
				for(int i=0;i<str.length;i++){
					a=Integer.parseInt(str[i]);
					if (i==1) {
						val=str[++i];
						arays[b][a]=val;
						pw.write(arays[b][a]+"\r\n");
					}
					b=a;
				}
			}
			
			//输出二维数组
			
			for(int m=1;m<arays.length;m++){
				for(int n=1;n<arays[m].length;n++){
					if (arays[m][n]==null) {
						arays[m][n]="0";
					}
					
					pw.write(arays[m][n]+" ");
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
