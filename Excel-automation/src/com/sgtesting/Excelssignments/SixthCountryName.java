package com.sgtesting.Excelssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SixthCountryName {

	public static void main(String[] args) {
		readCountryContent();
		

	}
	
	private static void readCountryContent()
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
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\CountryName.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");			
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);				
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);					
					String data=cell.getStringCellValue();
					System.out.printf("%-20s",data);
				}
				System.out.println();
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		try {
			sh1=wb.createSheet("Sheet2");
			
			for(int j=0;j<2;j++)
			{
			row1=sh1.createRow(j);
			cell1=row1.createCell(0);
			cell1.setCellValue("color"+(j+1));
			}			
			fout=new FileOutputStream("E:\\EXCEL\\CountryName.xlsx");
			wb.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	

}
