package io;
import java.io.BufferedReader;
import java.io.FileReader;

public class test4 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\io\\test.txt"));
			String line = null;
			String[] str = null;
			int a = 0, b = 0;
			String c = null;
			String[][] s = new String[5][6];
			// ���ж�ȡ�ļ��е�����
			while ((line = br.readLine()) != null) {
				// ���ո�ָ�ÿ�е����ݲ�������뵽������
				/*���java.lang.NumberFormatException: For input string: ""��ԭ����Ϊ�ļ�����ǰ���пո�
				*�����пո�Ӱ�����������
				*/
				//ȥ�ո� TRIM() �����������Ƴ���һ���ִ��е���ͷ����β;  RTRIM()ȥ���ұߵĿո�, LTRIM()ȥ����ߵĿո�
				line=line.trim();             
				str = line.split(" ");
				//System.out.println(line);

				// ������
				for (int i = 0; i < str.length; i++) {
					a = Integer.parseInt(str[i]);
					if (i == 1) {
						c = str[++i];
						s[b][a] = c;
					}
					// ��һ��ֵ���Ƹ�b
					b = a;
				}
			}
			// ѭ����ȡ��ά����
			for (int m = 0; m < s.length; m++) {
				for (int n = 0; n < s[m].length; n++) {
					// �ж�s[m][n]�Ƿ��Ѹ�ֵ��û�и�ֵʱ��null�����临��Ϊ"0"(��Ϊ���Ƕ������String����Ҳ���Զ���ΪInt������)
					if (s[m][n] == null) {
						s[m][n] = "0";
					}
					System.out.print(s[m][n] + " ");
				}
				System.out.println("");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
