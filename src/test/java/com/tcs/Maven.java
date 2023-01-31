package com.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Abi\\eclipse-workspace\\Framework\\Excel data\\Book2.xlsx");
		
		Workbook w = new XSSFWorkbook(loc);
		Sheet s = w.createSheet("Sheet2");
		Row r = s.createRow(1);
		Cell c = r.createCell(0);
		c.setCellValue("java");
		System.out.println(c);
		
	}

}
