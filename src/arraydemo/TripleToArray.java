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
			String[] str=null;// ��һά�������ڴ��ÿһ�е�����
			int a=0,b=0;
			String val=null;
			String[][] arays=new String[6][7];
			
			//���ڴ�ž�����ļ�
			File f=new File("f:\\test\\");
			f.mkdirs();
			File file=new File(f.getAbsolutePath(),"result2.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);//������������ָ���ļ�
			
			while((line=br.readLine())!=null){
				line=line.trim();
				str=line.split(" ");//�����Կո�ָ�ŵ�һλ������
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
			
			//�����ά����
			
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
