package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int size=12;
		int[] a=new int[size];
		int[] b=new int[size];
		float[] c=new float[size];
		
		//¶ÁÈ¡ÎÄ¼þ
		BufferedReader br=new BufferedReader(new FileReader("src\\io\\b.txt"));
		String line=br.readLine();
		int i=0;
		
		while(line!=null){
			String[] numbers=line.split(" ");
			a[i]=Integer.parseInt(numbers[0]);
			b[i]=Integer.parseInt(numbers[1]);
			c[i]=Float.parseFloat(numbers[2]);
			i++;
			line=br.readLine();
		}
		
		for(int a0:a){
			System.out.print(a0+"\t");
		}
		System.out.println();
		for(int b0:b){
			System.out.print(b0+"\t");
		}
		System.out.println();
		for(float c0:c){
			System.out.print(c0+"\t");
		}
		br.close();
		
	}

}
