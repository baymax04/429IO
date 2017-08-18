package io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class test3 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\io\\test.txt"));
			String line = null;
			String[] str = null;
			int a = 0, b = 0;
			String c = null;
			String[][] s = new String[5][6];//存储稀疏矩阵的二维数组
			
			
			//目的文件
			File f=new File("f:\\430\\");
			f.mkdirs();
			File file=new File(f.getAbsolutePath(),"result.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pWriter=new PrintWriter(file);
			
			
			// 按行读取文件中的内容
			while ((line = br.readLine()) != null) {
				// 按空格分割每行的内容并将其放入到数组中
				/*造成java.lang.NumberFormatException: For input string: ""的原因因为文件数字前面有空格
				*后面有空格不影响程序与运行
				*/
				//去空格 TRIM() 函数是用来移除掉一个字串中的字头或字尾;  RTRIM()去除右边的空格, LTRIM()去除左边的空格
				line=line.trim(); 
				str = line.split(" ");

				pWriter.write(line+"\r\n");
				
				for (int i = 0; i < str.length; i++) {
					a = Integer.parseInt(str[i]);
					if (i == 1) {
						c = str[++i];
						s[b][a] = c;
						
						pWriter.append(s[b][a]+"\r\n");
					}
					// 将一个值复制给b
					b = a;
				}
				
				
				//或者这么写
//				for (int i = 0; i < str.length; i++){
//					if (i==0) {
//						a=Integer.parseInt(str[i]);
//					}
//					if (i==1) {
//						b=Integer.parseInt(str[i]);
//						c=str[++i];
//						s[a][b]=c;
//					}
//				}
			}
			
			
			// 循环读取二维数组
			for (int m = 0; m < s.length; m++) {
				for (int n = 0; n < s[m].length; n++) {
					// 判断s[m][n]是否已赋值，没有赋值时是null，将其复制为"0"(因为我们定义的是String数组也可以定义为Int的数组)
					if (s[m][n] == null) {
						s[m][n] = "0";
					}
					pWriter.append(s[m][n] + " ");
				}
				pWriter.append("\r\n");
			}
			pWriter.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
