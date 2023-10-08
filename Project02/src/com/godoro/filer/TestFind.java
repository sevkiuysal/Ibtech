package com.godoro.filer;

import java.util.ArrayList;
import java.util.List;

public class TestFind {
	
	private static Supplier find(List<Supplier> supplierList,long supplierId)
	{
		for(Supplier supplier:supplierList)
		{
			if(supplier.getSupplierId()==supplierId)
				return supplier;
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		List<Supplier>supplierList=new ArrayList<>();
		supplierList.add(new Supplier(601,"Cem Karaca",6540));
		supplierList.add(new Supplier(602,"Barýþ Manço",7645));
		supplierList.add(new Supplier(603,"Fikret Kýzýlok",3450));
		
		long supplierId=602;
		for(Supplier supplier:supplierList)
		{
			if(supplier==find(supplierList,supplierId))
			System.out.println(supplier.getSupplierId()+" "
					+supplier.getSupplierName()+" "
					+supplier.getTotalCredit());
			
		}
	}

}
