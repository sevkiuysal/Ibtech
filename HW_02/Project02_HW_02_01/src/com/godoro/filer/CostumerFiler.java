package com.godoro.filer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CostumerFiler {
	
	private String filePath;
	
	public final static String DELIMETER=";";

	public CostumerFiler(String filePath) {
		this.filePath = filePath;
	}
	
	public void store(List<Costumer> costumerList) throws IOException
	{
		BufferedWriter bw =new BufferedWriter(new FileWriter(filePath));
		for(Costumer costumer:costumerList)
		{
			String line=format(costumer);
			bw.write(line);
			bw.write("\r\n");
		}
		bw.close();		
	}
	
	public String format(Costumer costumer)
	{
		StringBuilder builder=new StringBuilder();
		builder.append(costumer.getCostumerId()).append(DELIMETER)
		.append(costumer.getCostumerName()).append(DELIMETER)
		.append(costumer.getTotalDebit());
		String line=builder.toString();
			
		return line;
	}
	
	public List <Costumer> load() throws IOException
	{
		List<Costumer> costumerList=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		String line=null;
		
		while((line=br.readLine())!=null)
		{
			String [] tokens=line.split(DELIMETER);
			Costumer costumer=new Costumer();
			costumer.setCostumerId(Long.parseLong(tokens[0]));
			costumer.setCostumerName(tokens[1]);
			costumer.setTotalDebit(Double.parseDouble(tokens[2]));
			costumerList.add(costumer);
		}
		br.close();
		return costumerList;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	

}
