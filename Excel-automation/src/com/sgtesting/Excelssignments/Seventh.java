package com.sgtesting.Excelssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Seventh {

	public static void main(String[] args) {
		readWriteContent();

	}
	public static void readWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row sh1row=null;
		Row sh2row=null;
		Cell sh1cell=null;
		Cell sh2cell=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Test2.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				sh1row=sh1.getRow(r);
				sh2row=sh2.getRow(9);
				if(sh2row==null)
				{
					sh2row=sh2.createRow(r);
				}
				int cc=sh1row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					sh1cell=sh1row.getCell(9);
					sh2cell=sh2row.getCell(9);
					if(sh2cell==null)
					{
						sh2cell=sh2row.createCell(9);
					}
					String data=sh1cell.getStringCellValue();
					sh2cell.setCellValue(data);
				}
				
			}
			fout=new FileOutputStream("E:\\EXCEL\\Test2.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
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
