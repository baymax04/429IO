package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ColToArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int size=6;
		int[] a=new int[size];
		int[] b=new int[size];
		float[] c=new float[size];
		
		BufferedReader br=new BufferedReader(new FileReader("src\\io\\a.txt"));
		String line=br.readLine();
		int i=0;//从0开始
		while(line!=null){
			String[] numbers=line.split(" ");//这个是跳过空格
			a[i]=Integer.parseInt(numbers[0]);
			b[i]=Integer.parseInt(numbers[1]);
			c[i]=Float.parseFloat(numbers[2]);
			i++;
			line=br.readLine();
		}
		
		for(int num:a){
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num:b){
			System.out.print(num+" ");
		}
		System.out.println();
		for(float num:c){
			System.out.print(num+" ");
		}
		br.close();
		
		
	}

}
