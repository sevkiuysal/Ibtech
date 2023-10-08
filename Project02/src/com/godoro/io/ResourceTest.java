package com.godoro.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ResourceTest {
	
	public static void main(String[] args) {
		String path="C:\\Users\\þevki\\Desktop\\workspace\\Project02\\out.txt";
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path)))
		{
			bw.write("Java");
			bw.write("JAX");
			bw.write("JDBC");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
