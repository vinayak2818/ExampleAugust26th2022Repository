package com.sgtesting.ExcelOperation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) {
		ReadFile();

	}
	private static void ReadFile()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			fin=new FileInputStream("E:\\EXCEL\\Employee.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet0");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
