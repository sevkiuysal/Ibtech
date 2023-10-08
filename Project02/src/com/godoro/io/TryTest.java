package com.godoro.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TryTest {

	public static void main(String[] args) {
String path="C:\\Users\\þevki\\Desktop\\workspace\\Project02\\out.txt";
		
		BufferedWriter bw=null;
			try {
				bw=new BufferedWriter(new FileWriter(path));
				bw.write("Java");
				bw.write("JAX");
				bw.write("JDBC");
		
			} catch (Exception e) {
				e.printStackTrace();
			}	
			finally {
				try {
					if(bw!=null)
					{
						bw.close();
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}
}
