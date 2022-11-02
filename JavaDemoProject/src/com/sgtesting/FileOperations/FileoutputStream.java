package com.sgtesting.FileOperations;

import java.io.FileOutputStream;

public class FileoutputStream {

	public static void main(String[] args) {
		WriteContent();

	}
	private static void WriteContent()
	{
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\Application_Assignments.txt");
			String str="java is a beautiful lanaguage";
			str+="java used for developing the Aplication";
			byte b[]=str.getBytes();
			fout.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				fout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
