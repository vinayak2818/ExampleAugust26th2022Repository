package com.sgtesting.WebAutomationExcel;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstRunnerscript {

	public static void main(String[] args) {
		ExecuteMethods();

	}
	private static void ExecuteMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row rw=null;
		Row rw1=null;
		Cell cl=null;
		Cell cl1=null;
		try {

			fin=new FileInputStream(".\\DataFiles\\WebExcelMergedSuite.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("First");
			
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
			sh1=wb.getSheet("Second");
			int rc1=sh1.getPhysicalNumberOfRows();

			for(int i=1;i<rc1;i++)
			{
				rw1=sh1.getRow(i);
				cl1=rw1.getCell(0);
				String Methodname1=cl1.getStringCellValue();
				cl1=rw1.getCell(1);
				String pkgclassname1=cl1.getStringCellValue();
				System.out.println(Methodname1+"--->"+pkgclassname1);

				Class clsObject=Class.forName(pkgclassname1);
				Object obj=clsObject.getConstructor().newInstance();

				Method method=obj.getClass().getMethod(Methodname1, null);
				method.invoke(obj, null);
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
