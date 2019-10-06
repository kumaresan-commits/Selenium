package org.maven.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetDataFromExcel {
	
	
	@Test
	public void getData() throws IOException{
		
		FileInputStream fis = new FileInputStream("./DataSheet/data1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<rowCount; i++){
			
			XSSFRow row = sheet.getRow(i);
			
			
			for(int j=0; j<colCount; j++){
				
				String cellValue = row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
			
		}
		
		fis.close();
	}

}
