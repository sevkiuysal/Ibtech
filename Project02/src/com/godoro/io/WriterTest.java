package com.godoro.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\þevki\\Desktop\\workspace\\Project02\\out.txt";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		bw.write("Java");
		bw.write("JAX");
		bw.write("JDBC");
		
		
		bw.close();
	}

}
