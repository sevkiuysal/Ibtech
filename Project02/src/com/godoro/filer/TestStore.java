package com.godoro.filer;

import java.util.ArrayList;
import java.util.List;

public class TestStore {
	public static void main(String[] args) {
	
		try {
		List<Supplier>supplierList=new ArrayList<>();
		supplierList.add(new Supplier(601,"Cem Karaca",6540));
		supplierList.add(new Supplier(602,"Bar�� Man�o",7645));
		supplierList.add(new Supplier(603,"Fikret K�z�lok",3450));
		
		String filePath="C:\\Users\\�evki\\Desktop\\workspace\\Project02\\Supplier.txt";
		SupplierFiler supplierFiler=new SupplierFiler(filePath);
		supplierFiler.store(supplierList);	
		}
		catch(Exception e)
		{
		e.printStackTrace();
	  
		}
	
	}
}
