package com.godoro.filer;

import java.io.IOException;
import java.util.List;

public class TestLoad2 {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\þevki\\Desktop\\workspace\\Project02_HW_02_01\\Costumer.txt";
		CostumerFiler costumerFiler=new CostumerFiler(filePath);
		List <Costumer> costumerList=costumerFiler.load();
		
		for(Costumer costumer:costumerList)
		{
			System.out.println(costumer.getCostumerId()+" "
					+costumer.getCostumerName()+" "
					+costumer.getTotalDebit());
		}
	}
}
