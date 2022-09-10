package com.godoro.console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SupplierFiler {

	private String filePath;
	
	public final static String DELIMETER=";";

	public SupplierFiler(String filePath) {
		this.filePath = filePath;
	}
	
	public void store(List<Supplier>supplierList) throws IOException
	{
		BufferedWriter bw =new BufferedWriter(new FileWriter(filePath));
		for(Supplier supplier:supplierList)
		{
			String line=format(supplier);
			bw.write(line);
			bw.write("\r\n");
			
		}
		bw.close();		
	}
	
	public String format(Supplier supplier)
	{
		StringBuilder builder=new StringBuilder();
		builder.append(supplier.getSupplierId()).append(DELIMETER)
		.append(supplier.getSupplierName()).append(DELIMETER)
		.append(supplier.getTotalCredit());
		String line=builder.toString();
			
		return line;
	}
	
	public List <Supplier> load() throws IOException
	{
		List<Supplier> supplierList=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		String line=null;
		
		while((line=br.readLine())!=null)
		{
			String [] tokens=line.split(DELIMETER);
			Supplier supplier=new Supplier();
			supplier.setSupplierId(Long.parseLong(tokens[0]));
			supplier.setSupplierName(tokens[1]);
			supplier.setTotalCredit(Double.parseDouble(tokens[2]));
			supplierList.add(supplier);
		}
		br.close();
		return supplierList;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
