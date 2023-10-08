package com.godoro.filer;

import java.io.IOException;
import java.util.List;

public class TestLoad {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\þevki\\Desktop\\workspace\\Project02\\Supplier.txt";
		SupplierFiler supplierFiler=new SupplierFiler(filePath);
		List<Supplier>supplierList=supplierFiler.load();
		for(Supplier supplier:supplierList)
		{
			System.out.println(supplier.getSupplierId()+" "
					+supplier.getSupplierName()+" "
					+supplier.getTotalCredit());
		}
	}

}
