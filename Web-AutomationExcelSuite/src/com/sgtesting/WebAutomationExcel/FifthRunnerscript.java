package com.sgtesting.WebAutomationExcel;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FifthRunnerscript {

	public static void main(String[] args) {
		ExecuteMethods();

	}
	private static void ExecuteMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try {
			fin=new FileInputStream(".\\DataFiles\\WebExcelSuite.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Fifth");
			int rc=sh.getPhysicalNumberOfRows();
			for(int i=1;i<rc;i++)
			{
				rw=sh.getRow(i);
				System.out.println("printing row"+rw);
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
