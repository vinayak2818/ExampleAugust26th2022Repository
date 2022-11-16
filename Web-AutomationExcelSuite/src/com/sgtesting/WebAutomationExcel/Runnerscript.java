package com.sgtesting.WebAutomationExcel;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runnerscript {

	public static void main(String[] args) {
		ExecuteMethods();

	}
	public static void ExecuteMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try {
			String sheets[]= {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth"};
			for(int j=0;j<sheets.length;j++)
			{
				fin=new FileInputStream(".\\DataFiles\\WebExcelSuite.xlsx");
				wb=new XSSFWorkbook(fin);
				

				System.out.println(sheets[j]);
				sh=wb.getSheet(sheets[j]);
				int rc=sh.getPhysicalNumberOfRows();
				for(int i=1;i<rc;i++)
				{
					rw=sh.getRow(i);
					cl=rw.getCell(0);
					String Methodname=cl.getStringCellValue();
					cl=rw.getCell(1);
					String pkgclassname=cl.getStringCellValue();
					System.out.println(Methodname+"--->"+pkgclassname);

					Class clsObject=Class.forName(pkgclassname);
					Object obj=clsObject.getConstructor().newInstance();

					Method method=obj.getClass().getMethod(Methodname, null);
					method.invoke(obj, null);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
