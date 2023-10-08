package com.godoro.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest {
	
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\�evki\\Desktop\\workspace\\Project02\\out.txt";
		BufferedReader br=new BufferedReader(new FileReader(path));
		String line=null;
		StringBuilder builder=new StringBuilder();
		while((line=br.readLine())!=null)
		{
			builder.append(line).append("\r\n");
		}
		
		String text=builder.toString();
		System.out.println("Yaz�:\n"+text);
		br.close();
	}

}
