package com.sgtesting.FileOperations;

import java.io.File;

public class Fileoperationdemo {

	public static void main(String[] args) {
		//CreateFolder();
		// RenameFolder();
		//DeleteFolder();
		//nestedfolder();
		Foldecollection();
	}
	private static void CreateFolder()
	{
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\New Folder4");
		f1.mkdir();
	}
	private static void RenameFolder()
	{
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\New Folder4");
		File f2=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\New Folder5");
		f1.renameTo(f2);
	}
	private static void DeleteFolder()
	{
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\New Folder5");
		boolean v1=f1.delete();
		System.out.println(v1);
	}
	private static void nestedfolder() {
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\mm1\\mm2\\mm3\\mm4");
		f1.mkdirs();
	}
	private static void Foldecollection()
	{
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				String path=f2[i].getPath();
				System.out.println(path);
			}
		}
	}

}
