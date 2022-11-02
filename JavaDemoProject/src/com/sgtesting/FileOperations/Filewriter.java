package com.sgtesting.FileOperations;

import java.io.FileWriter;

public class Filewriter {

	public static void main(String[] args) {
		fileWriter();

	}
	private static void fileWriter()
	{
		FileWriter fw=null;
		try {
			fw=new FileWriter("E:\\HTML\\autotest\\New Text Document.txt",true);
			String str="Selenium Automation";
			str+="We did Automation";
			char ch[]=str.toCharArray();
			fw.write(ch);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
