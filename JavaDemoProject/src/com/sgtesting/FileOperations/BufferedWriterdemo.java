package com.sgtesting.FileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterdemo {

	public static void main(String[] args) {
		WriteContent();

	}
	private static void WriteContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("E:\\HTML\\autotest\\New Text Document.txt",true);
			bw=new BufferedWriter(fw);

			bw.write("SQL stands for Structured Query Language ,");
			bw.newLine();
			bw.write("SQL is a Non procedural language");
			bw.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
