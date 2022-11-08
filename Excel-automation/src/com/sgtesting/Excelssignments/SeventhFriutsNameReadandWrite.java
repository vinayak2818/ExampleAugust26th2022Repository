package com.sgtesting.Excelssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SeventhFriutsNameReadandWrite {

	public static void main(String[] args) {

		ReadandWriteContent();
	}
	private static void ReadandWriteContent()
	{
		FileOutputStream fout=null;
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		try {
			fin=new FileInputStream("E:\\EXCEL\\Fruitsname.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");
			sh1=wb.createSheet("Sheet2");
			int rc=sh.getPhysicalNumberOfRows();
			row1=sh1.createRow(9);
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				
				//int cc=sh1.getPhysicalNumberOfRows();
				
					cell=row.getCell(9);
					cell1=row1.createCell(r);
					String data=cell.getStringCellValue();
					
					System.out.printf("%-20s",data);
					
					
					cell1.setCellValue(data);
									
								
				System.out.println();
			}
			
			fout=new FileOutputStream("E:\\EXCEL\\Fruitsname.xlsx");
			wb.write(fout);

		} catch (Exception e) {
			e.printStackTrace();
		}		
		finally {
			try {
				fin.close();
				fout.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
