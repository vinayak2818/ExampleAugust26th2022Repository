package com.sgtesting.FileOperations;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		readContent();

	}
	private static void readContent()
	{
		FileOutputStream fout=null;
		try {
			fout =new FileOutputStream("E:\\HTML\\autotest\\New Text Document.txt",true);
			String str="Java is a Programming Language";
			str+="Java used for Developing the Aplications";
			byte b[]=str.getBytes();
			fout.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
