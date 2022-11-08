package com.sgtesting.Excelssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FifthDiagonal {

	public static void main(String[] args) {
		CreateCityName();

	}
	private static void CreateCityName() {
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
			cell=row.createCell(i);
			cell.setCellValue("Cityname"+(i+1));
			}
			fout=new FileOutputStream("E:\\EXCEL\\CityDiagonal.xlsx");
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
