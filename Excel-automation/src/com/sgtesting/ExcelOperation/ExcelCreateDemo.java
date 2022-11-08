package com.sgtesting.ExcelOperation;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateDemo {

	public static void main(String[] args) {
		CreateContent();

	}
	private static void CreateContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet();
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("EmpName");
			cell=row.createCell(1);
			cell.setCellValue("Empsal");
			cell=row.createCell(2);
			cell.setCellValue("Designation");
			//second row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Vinayak");
			cell=row.createCell(1);
			cell.setCellValue("25000");
			cell=row.createCell(2);
			cell.setCellValue("QA");
			//Third Row
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Raghu");
			cell=row.createCell(1);
			cell.setCellValue("75000");
			cell=row.createCell(2);
			cell.setCellValue("Dev");
			//Fourth Row
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Sam");
			cell=row.createCell(1);
			cell.setCellValue("75000");
			cell=row.createCell(2);
			cell.setCellValue("Legend");
			//Fifth row
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Nikhil");
			cell=row.createCell(1);
			cell.setCellValue("175000");
			cell=row.createCell(2);
			cell.setCellValue("Civil Contractor");

			fout=new FileOutputStream("E:\\EXCEL\\Employee.xlsx");
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
