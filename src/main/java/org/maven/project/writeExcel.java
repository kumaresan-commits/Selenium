package org.maven.project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {
	
	public writeExcel() throws IOException{
		
		FileInputStream fis = new FileInputStream("./DataSheet/data2.xlsx ");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
	//	cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("kkk");
		Row row1= sheet.createRow(2);
		Cell cell1 = row.createCell(1);
		cell.setCellValue("ss");
		FileOutputStream fos = new FileOutputStream("./DataSheet/data2.xlsx");

		workbook.write(fos);
		fos.close();
	}
public static void main(String args[]) throws IOException{
	
	writeExcel we = new writeExcel();
}
}
