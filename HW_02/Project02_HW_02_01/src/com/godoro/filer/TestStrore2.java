package com.godoro.filer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestStrore2 {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\þevki\\Desktop\\workspace\\Project02_HW_02_01\\Costumer.txt";
		List<Costumer> costumerList=new ArrayList<>();
		costumerList.add(new Costumer(601,"Cem Karaca",6540));
		costumerList.add(new Costumer(602,"Barýþ Manço",7645));
		costumerList.add(new Costumer(603,"Fikret Kýzýlok",3450));
		
		CostumerFiler costumerFiler=new CostumerFiler(filePath);
		costumerFiler.store(costumerList);
	}

}
