package org.maven.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {
	
	public static void main(String args[]) throws IOException{
		
		try {
			FileInputStream fis = new FileInputStream("./DataSheet/data1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			
			for(int i=0;i<rowCount;i++){
				
				
				try{
					XSSFRow row = sheet.getRow(i);
					
					for(int j=0; j<columnCount; j++){
						
						String cellValue;
						try {
							cellValue = "";
							
							try {
								cellValue = row.getCell(j).getStringCellValue();
								
								int value = Integer.valueOf(cellValue);
								
								if(value>100){
									
									System.out.println(value);
								}
								
							} catch (NullPointerException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							catch(NumberFormatException e){
								e.printStackTrace();
							}
							System.out.println(cellValue);
						} 
						
						
						
						catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
			
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
