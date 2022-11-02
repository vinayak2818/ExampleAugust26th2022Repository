package com.sgtesting.FileOperations;

import java.io.File;

public class Fileoperationsdemo1 {

	public static void main(String[] args) {
		File f1=new File("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\HTMLTutorials.txt");
		//Display name of file
		String name=f1.getName();
		System.out.println("File name:"+name);
		//Display path of File
		String path1=f1.getPath();
		System.out.println("File path:"+path1);
		//Display Folder Path
		String Path2=f1.getParent();
		System.out.println(Path2);
		//Read permission
		boolean v1=f1.canWrite();
		System.out.println("Does it have Raed Permission:"+v1);
		//Read Permission
		boolean v2=f1.canExecute();
		System.out.println("Does it have Execute Permission:"+v2);
		//Is it a File?
		boolean v3=f1.isFile();
		System.out.println("Is it a File:"+v3);
		//Is it a Folder?
		boolean v4=f1.isDirectory();
		System.out.println("Is it a Folder:"+v4);
	}

}
