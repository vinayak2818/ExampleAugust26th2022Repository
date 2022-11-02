package com.sgtesting.FileOperations;

import java.io.File;

public class FileOperationDemo2 {

	public static void main(String[] args) {
		//Craetefile();
		//RenameFile();
		//DeleteFile();
		Filecollection();

	}
	private static void Craetefile()
	{
		try
		{
			File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\Testing.txt");
			f1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void RenameFile()
	{
		try 
		{
			File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\Testing.txt");
			File f2=new File("E:\\\\HTML\\\\htmltutorials_20_oct_2022\\\\New folder1\\\\New folder2\\\\New folder3\\\\DemoTesting.txt");
			f1.renameTo(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteFile()
	{
		try 
		{
			File f1=new File("E:\\\\HTML\\\\htmltutorials_20_oct_2022\\\\New folder1\\\\New folder2\\\\New folder3\\\\DemoTesting.txt");
			boolean v1=f1.delete();
			System.out.println("Is it deleted:"+v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Filecollection()
	{
		try 
		{
			File f1=new File("E:\\\\HTML\\\\htmltutorials_20_oct_2022");
			File[] f2=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
				{
					String path=f2[i].getPath();
					System.out.println(path);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
 