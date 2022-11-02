package com.sgtesting.FileOperations;

import java.io.FileInputStream;

public class FileinputStream {

	public static void main(String[] args) {
		ReadElements();

	}
	private static void ReadElements()
	{
		FileInputStream fin=null;
		int n=0;
		try 
		{
			fin=new FileInputStream("E:\\HTML\\htmltutorials_20_oct_2022\\New folder1\\New folder2\\New folder3\\Application_Assignments.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				/*
				 * If file is invalid,It provides Exception in while
				 * Create FileInputStream object
				 * If we try to close the same object,It provides NP
				 * So in order to handle Exception finally block
				 * should contain try catch
				 */
				fin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
