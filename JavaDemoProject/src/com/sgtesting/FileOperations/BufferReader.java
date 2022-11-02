package com.sgtesting.FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) {
		readContent();

	}
	private static void readContent()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("E:\\HTML\\autotest\\New Text Document.txt"); 
			br=new BufferedReader(fr);
			String Strline=null;
			while((Strline=br.readLine())!=null)
			{
				System.out.println(Strline);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
