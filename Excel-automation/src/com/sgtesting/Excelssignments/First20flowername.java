package com.sgtesting.Excelssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class First20flowername {

	public static void main(String[] args) {
		CreateFlower();

	}
	private static void CreateFlower() {
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet();			
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("Flower"+(i+1));
			}
			
			fout=new FileOutputStream("E:\\EXCEL\\Flower.xlsx");
			wb.write(fout);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

