package com.godoro.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.jasper.tagplugins.jstl.core.Url;

public class StreamUtilities {

	public static String read(InputStream in) throws Exception
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(in,"utf-8"));
		String line;
		StringBuilder builder=new StringBuilder();
		while((line=reader.readLine())!=null)
		{
			builder.append(line).append("\r\n");
		}
		reader.close();
		String text=builder.toString();
		return text;
	}
	
	public static String get(String address) throws Exception
	{
		URL url=new URL(address);
		URLConnection connection=url.openConnection();
		InputStream in=connection.getInputStream();
		return read(in);
			
			
			
			
	}
}
