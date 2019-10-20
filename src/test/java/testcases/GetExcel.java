package testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcel {

	
	public String[][] getExcelData(String filePath){
		
		
		String[][] arrayData =null;
		
		try{
			
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			//XSSFRow row = sheet.getRow(0);
			
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			
			arrayData = new String[rowCount][colCount];
			
			for(int i=1; i<=rowCount; i++){
				
				XSSFRow row = sheet.getRow(i);
				String cellValue ="";
				
				for(int j=0; j<colCount; j++){
					
					cellValue = row.getCell(j).getStringCellValue();
					
					arrayData[i][j] = cellValue;
					
				}
				
			}
			
			
			
		}catch(NullPointerException e){
			
			e.printStackTrace();
		}
		
		
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		return arrayData;
		
	}
	
}
